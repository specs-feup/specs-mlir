/**
 * Copyright 2023 SPeCS.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with
 * the License. You may obtain a copy of the License at
 * 
 * http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on
 * an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the
 * specific language governing permissions and limitations under the License. under the License.
 */

package pt.up.fe.specs.mlir.antlr2nodedata;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

import org.antlr.v4.runtime.Parser;
import org.antlr.v4.runtime.RuleContext;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.TerminalNode;
import org.suikasoft.jOptions.Interfaces.DataStore;

import pt.up.fe.specs.mlir.antlr.AntlrUtils;
import pt.up.fe.specs.mlir.ast.GenericNode;
import pt.up.fe.specs.mlir.ast.MlirNode;
import pt.up.fe.specs.mlir.ast.context.MlirContext;
import pt.up.fe.specs.mlir.ast.data.Location;
import pt.up.fe.specs.mlir.ast.dummy.Root;
import pt.up.fe.specs.mlir.ast.operation.GenericOperation;
import pt.up.fe.specs.mlir.ast.operation.Operation;
import pt.up.fe.specs.mlir.grammar.MlirParser.GenericOperationContext;
import pt.up.fe.specs.mlir.grammar.MlirParser.OperationContext;
import pt.up.fe.specs.mlir.grammar.MlirParser.RootContext;
import pt.up.fe.specs.util.SpecsCheck;
import pt.up.fe.specs.util.classmap.BiFunctionClassMap;
import pt.up.fe.specs.util.classmap.ClassMap;

public class AntlrToDataStore {

    private static final ClassMap<ParseTree, Class<? extends MlirNode>> ANTLR_TO_MLIR_CLASSES;
    static {
        ANTLR_TO_MLIR_CLASSES = new ClassMap<>();
        ANTLR_TO_MLIR_CLASSES.put(RootContext.class, Root.class);
        ANTLR_TO_MLIR_CLASSES.put(OperationContext.class, Operation.class);
        ANTLR_TO_MLIR_CLASSES.put(GenericOperationContext.class, GenericOperation.class);
        ANTLR_TO_MLIR_CLASSES.put(RuleContext.class, GenericNode.class);
    }

    private static final BiFunctionClassMap<ParseTree, ConverterData, ConversionResult<? extends MlirNode>> CONVERTERS;
    static {
        CONVERTERS = new BiFunctionClassMap<>();
        CONVERTERS.put(RootContext.class, AntlrToDataStore::convertRoot);
        CONVERTERS.put(GenericOperationContext.class, AntlrToDataStore::convertGenericOperation);
        CONVERTERS.put(OperationContext.class, AntlrToDataStore::convertOperation);
        CONVERTERS.put(RuleContext.class, AntlrToDataStore::convertDefault);
    }

    private final Map<ParseTree, MlirNode> antlrToJmm;
    private final ConverterData converterData;

    public AntlrToDataStore(Parser parser) {
        this.antlrToJmm = new HashMap<>();
        this.converterData = new ConverterData(parser, new MlirContext());
    }

    public MlirNode parse(String mlirCode, String ruleName) {
        var antlrNode = AntlrUtils.parse(mlirCode, ruleName);
        return convert(antlrNode);
    }

    public MlirNode convert(ParseTree node) {
        // Apply converter from map
        var result = CONVERTERS.apply(node, converterData);

        // Convert all children
        var children = new ArrayList<MlirNode>();
        for (int i = 0; i < node.getChildCount(); i++) {
            var childAntlrNode = node.getChild(i);

            if (childAntlrNode instanceof TerminalNode) {
                continue;
            }

            var childMlirNode = convert(childAntlrNode);
            children.add(childMlirNode);
        }

        // Create node
        var constructors = result.getNodeClass().getConstructors();
        SpecsCheck.checkArgument(constructors.length == 1,
                () -> "Expected only one constructor: " + Arrays.toString(constructors));

        try {
            // System.out.println("Calling constructor for " + constructors[0]);
            var mlirNode = (MlirNode) constructors[0].newInstance(result.getData(), children);

            antlrToJmm.put(node, mlirNode);

            return mlirNode;
        } catch (Exception e) {
            throw new RuntimeException("Could not call MlirNode constructor", e);
        }

    }

    private static DataStore newDataStore(ParseTree antlrNode, ConverterData data) {
        var dataStore = data.getContext().getFactory().newDataStore(ANTLR_TO_MLIR_CLASSES.get(antlrNode.getClass()));

        var parser = data.getParser();

        // Add line and column information
        var startPosition = parser.getTokenStream().get(antlrNode.getSourceInterval().a);
        var endPosition = parser.getTokenStream().get(antlrNode.getSourceInterval().b);

        dataStore
                .set(MlirNode.LOCATION, new Location(startPosition.getLine(), endPosition.getLine(),
                        startPosition.getCharPositionInLine(), endPosition.getCharPositionInLine()));

        return dataStore;
    }

    private static ConversionResult<Root> convertRoot(RootContext root, ConverterData data) {
        var dataStore = newDataStore(root, data);

        dataStore.put(Root.ID, root.getClass().getSimpleName());

        return new ConversionResult<>(dataStore, Root.class);
    }

    private static ConversionResult<Operation> convertOperation(OperationContext op, ConverterData data) {
        var dataStore = newDataStore(op, data);

        // Add stuff common to all operations

        return new ConversionResult<>(dataStore, Operation.class);
    }

    private static ConversionResult<GenericOperation> convertGenericOperation(GenericOperationContext genOp,
            ConverterData data) {

        var dataStore = newDataStore(genOp, data);

        dataStore.set(GenericOperation.NAME, genOp.name.getText());

        return new ConversionResult<>(dataStore, GenericOperation.class);
    }

    private static ConversionResult<MlirNode> convertDefault(ParseTree node, ConverterData data) {
        var dataStore = newDataStore(node, data);

        return new ConversionResult<>(dataStore, MlirNode.class);
    }

}

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
import java.util.HashMap;
import java.util.Map;

import org.antlr.v4.runtime.Parser;
import org.antlr.v4.runtime.tree.ParseTree;

import pt.up.fe.specs.mlir.ast.MlirNode;
import pt.up.fe.specs.mlir.ast.context.MlirContext;
import pt.up.fe.specs.mlir.ast.dummy.Root;
import pt.up.fe.specs.mlir.grammar.MlirParser.RootContext;
import pt.up.fe.specs.util.classmap.BiFunctionClassMap;

public class AntlrToMlirNodeConverter {

    private static final BiFunctionClassMap<ParseTree, ConverterData, MlirNode> CONVERTERS;
    static {
        CONVERTERS = new BiFunctionClassMap<>();
        CONVERTERS.put(RootContext.class, AntlrToMlirNodeConverter::convertRoot);
    }

    private final Map<ParseTree, MlirNode> antlrToJmm;
    private final ConverterData converterData;

    public AntlrToMlirNodeConverter(Parser parser) {
        this.antlrToJmm = new HashMap<>();
        this.converterData = new ConverterData(parser, new MlirContext());
    }

    public MlirNode convert(ParseTree node) {
        // Apply converter from map
        var mlirNode = CONVERTERS.apply(node, converterData);

        // Set mapping
        antlrToJmm.put(node, mlirNode);

        // Convert all children
        var children = new ArrayList<MlirNode>();
        for (int i = 0; i < node.getChildCount(); i++) {
            var childAntlrNode = node.getChild(i);
            var childMlirNode = convert(childAntlrNode);
            children.add(childMlirNode);
        }

        // Set children
        mlirNode.setChildren(children);

        return mlirNode;
    }

    private static Root convertRoot(RootContext root, ConverterData data) {
        return data.getContext().getFactory().root(root.ID().getText());
    }

}

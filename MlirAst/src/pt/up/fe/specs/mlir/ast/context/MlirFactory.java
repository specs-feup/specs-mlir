/**
 * Copyright 2018 SPeCS.
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

package pt.up.fe.specs.mlir.ast.context;

import org.suikasoft.jOptions.Interfaces.DataStore;
import org.suikasoft.jOptions.storedefinition.StoreDefinitions;

import pt.up.fe.specs.mlir.ast.MlirNode;
import pt.up.fe.specs.mlir.ast.dummy.Root;
import pt.up.fe.specs.mlir.ast.operation.GenericOperation;
import pt.up.fe.specs.mlir.ast.operation.Operation;
import pt.up.fe.specs.util.classmap.ClassMap;

/**
 * Factory methods for ClavaNodes that use the DataStore format.
 *
 * <p>
 * This class provides minimal methods for building new nodes, further specialization should be done using the .set()
 * method of the respective node.
 *
 * @author JoaoBispo
 *
 */
public class MlirFactory {

    // private static final Collection<String> AST_NODES_PACKAGES = Arrays.asList("pt.up.fe.specs.mlir.ast");

    private static final String GENERIC_ID_PREFIX = "node_";

    private static final ClassMap<MlirNode, String> PREFIX_MAP;
    static {
        PREFIX_MAP = new ClassMap<>();
        PREFIX_MAP.put(MlirNode.class, GENERIC_ID_PREFIX);
    }

    private final MlirContext context;
    private final DataStore baseData;
    // private final ClassesService<MlirNode> classesService;

    public MlirFactory(MlirContext context) {
        this(context, null);
    }

    public MlirFactory(MlirContext context, DataStore baseData) {
        this.context = context;
        this.baseData = baseData;
        // this.classesService = new ClassesService<>(MlirNode.class, AST_NODES_PACKAGES);
    }

    public DataStore newDataStore(Class<? extends MlirNode> nodeClass) {

        // Get the correct prefix for the given class
        String idPrefix = PREFIX_MAP.get(nodeClass);

        DataStore data = DataStore.newInstance(StoreDefinitions.fromInterface(nodeClass), true);

        // Add base node, if present
        if (baseData != null) {
            data.addAll(baseData);
        }

        // Set context
        data.set(MlirNode.CONTEXT, context);

        // Set id
        data.set(MlirNode.NODE_ID, context.get(MlirContext.ID_GENERATOR).next(idPrefix));

        return data;
    }

    // public <T extends MlirNode> T node(Class<T> nodeClass, MlirNode... children) {
    // return node(nodeClass, Arrays.asList(children));
    // }
    //
    // /**
    // * Generic builder function, does not set any attributes on the created node.
    // *
    // * @param <T>
    // * @param nodeClass
    // * @param children
    // * @return
    // */
    // public <T extends MlirNode> T node(Class<T> nodeClass, List<? extends MlirNode> children) {
    //
    // DataStore data = newDataStore(nodeClass);
    //
    // return nodeClass.cast(classesService.getNodeBuilder(nodeClass).apply(data, children));
    // }

    /// DUMMY NODES

    public Root root(String id) {
        DataStore data = newDataStore(Root.class);
        data.set(Root.ID, id);
        return new Root(data, null);
    }

    /// OPERATION NODES

    public Operation operation(String result) {
        DataStore data = newDataStore(Operation.class);
        data.set(Operation.RESULT, result);
        return new Operation(data, null);
    }
    
    public GenericOperation genericOperation(String name) {
        DataStore data = newDataStore(GenericOperation.class);
        data.set(GenericOperation.NAME, name);
        return new GenericOperation(data, null);
    }
}

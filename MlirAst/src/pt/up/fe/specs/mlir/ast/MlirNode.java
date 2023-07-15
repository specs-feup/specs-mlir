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

package pt.up.fe.specs.mlir.ast;

import java.util.Collection;

import org.suikasoft.jOptions.Datakey.DataKey;
import org.suikasoft.jOptions.Datakey.KeyFactory;
import org.suikasoft.jOptions.Interfaces.DataStore;
import org.suikasoft.jOptions.treenode.DataNode;

import pt.up.fe.specs.mlir.ast.context.MlirContext;

public class MlirNode extends DataNode<MlirNode> {

    /// DATAKEYS BEGIN

    /**
     * Global object with information about the program.
     * 
     */
    public final static DataKey<MlirContext> CONTEXT = KeyFactory.object("context", MlirContext.class);

    /**
     * Id of the node.
     */
    public final static DataKey<String> NODE_ID = KeyFactory.string("node_id");

    /// DATAKEYS END

    public MlirNode(DataStore data, Collection<? extends MlirNode> children) {
        super(data, children);
    }

    @Override
    protected Class<MlirNode> getBaseClass() {
        return MlirNode.class;
    }

}

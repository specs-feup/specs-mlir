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

import org.suikasoft.jOptions.DataStore.ADataClass;
import org.suikasoft.jOptions.Datakey.DataKey;
import org.suikasoft.jOptions.Datakey.KeyFactory;

import pt.up.fe.specs.util.utilities.IdGenerator;

public class MlirContext extends ADataClass<MlirContext> {

    /// DATAKEYS BEGIN

    /**
     * IDs generator
     */
    public final static DataKey<IdGenerator> ID_GENERATOR = KeyFactory
            .object("idGenerator", IdGenerator.class)
            .setDefault(() -> new IdGenerator())
            .setCopyFunction(id -> new IdGenerator(id));

    public final static DataKey<MlirFactory> FACTORY = KeyFactory
            .object("factory", MlirFactory.class);

    /// DATAKEYS END

    public MlirContext() {

        // Initialize factory
        set(FACTORY, new MlirFactory(this));

    }

    public MlirFactory getFactory() {
        return get(FACTORY);
    }

    public IdGenerator getIdGenerator() {
        return get(ID_GENERATOR);
    }

}

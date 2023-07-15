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

import org.antlr.v4.runtime.Parser;

import pt.up.fe.specs.mlir.ast.context.MlirContext;

public class ConverterData {

    private final Parser parser;
    private final MlirContext context;

    public ConverterData(Parser parser, MlirContext context) {
        this.parser = parser;
        this.context = context;
    }

    /**
     * @return the parser
     */
    public Parser getParser() {
        return parser;
    }

    /**
     * @return the context
     */
    public MlirContext getContext() {
        return context;
    }

}

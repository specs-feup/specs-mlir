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

import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;

import pt.up.fe.specs.mlir.grammar.MlirLexer;
import pt.up.fe.specs.mlir.grammar.MlirParser;

public class Antlr2NodeDataLauncher {

    public static void main(String[] args) {
        // Convert code string into a character stream
        var input = new ANTLRInputStream("hello a");
        // Transform characters into tokens using the lexer
        var lex = new MlirLexer(input); // Will we interact with this?

        // Wrap lexer around a token stream
        var tokens = new CommonTokenStream(lex);
        // Transforms tokens into a parse tree
        var parser = new MlirParser(tokens);

        var rootNode = parser.root();

        System.out.println(rootNode.toStringTree());

    }

}

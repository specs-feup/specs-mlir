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

package pt.up.fe.specs.mlir.grammar;

import org.antlr.v4.gui.TreeViewer;
import org.antlr.v4.parse.ANTLRParser;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
// import pt.up.fe.specs.util.SpecsSystem;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

public class GrammarTest {

    @Test
    public void test() {
        // Convert code string into a character stream
        var input = new ANTLRInputStream("%a_b = \"b\"(%c, %d){e = f, g = h} : (tensor<2x3xf64>) -> (tensor<2x3xf64>) loc(\"i/j/k\":12:1)");
        // Transform characters into tokens using the lexer
        var lex = new MlirLexer(input); // Will we interact with this?

        // Wrap lexer around a token stream
        var tokens = new CommonTokenStream(lex);
        // Transforms tokens into a parse tree
        var parser = new MlirParser(tokens);

        var rootNode = parser.root();

        TreeViewer viewer = new TreeViewer(
                Arrays.asList(parser.getRuleNames()),
                rootNode
        );
        viewer.open();

        System.out.println(rootNode.toStringTree(parser));
        // parse(lex, parser, "r");
    }

    /*
    public static void parse(Lexer lex, Parser parser, String ruleName) {
        lex.removeErrorListeners();
    
        parser.
        // lex.addErrorListener(new ThrowingErrorListener());
    
        ParseTree node = (ParseTree) SpecsSystem.invoke(parser, ruleName, new Object[0]);
        if (parser.getNumberOfSyntaxErrors() > 0) {
            return;
        } else {
            System.out.println(node.toStringTree());
        }
    
    
    }
    */
}

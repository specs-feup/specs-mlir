package antlr.pt.up.fe.specs.mlir;

import org.antlr.v4.gui.TreeViewer;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import pt.up.fe.specs.mlir.grammar.MlirLexer;
import pt.up.fe.specs.mlir.grammar.MlirParser;

import javax.swing.*;
import java.util.Arrays;
import java.util.concurrent.ExecutionException;

public class Launcher {
    public static void main(String[] args) {
        String code = "memref<?xbf16>";
        // Convert code string into a character stream
        var input = new ANTLRInputStream(code);
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
        var window = viewer.open();
        /*
        try {
            var w = window.get();
            w.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        } catch (ExecutionException e) {
            throw new RuntimeException(e);
        }

         */

        System.out.println(rootNode.toStringTree(parser));
    }
}

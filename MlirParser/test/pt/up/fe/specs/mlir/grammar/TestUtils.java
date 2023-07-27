package pt.up.fe.specs.mlir.grammar;

import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.tree.ParseTree;

import java.util.Collection;
import java.util.stream.Collectors;

public class TestUtils {

    public static String nodesText(Collection<? extends ParseTree> nodes) {
        return nodes.stream().map(t -> t.getText()).collect(Collectors.joining(", "));
    }

    public static String tokensText(Collection<? extends Token> nodes) {
        return nodes.stream().map(t -> t.getText()).collect(Collectors.joining(", "));
    }
}

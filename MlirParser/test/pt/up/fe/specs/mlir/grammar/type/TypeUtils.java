package pt.up.fe.specs.mlir.grammar.type;

import pt.up.fe.specs.mlir.grammar.MlirParser;

public class TypeUtils {
    public static String args(MlirParser.FunctionTypeContext context) {
        return context.children.get(0).getText();
    }

    public static String rets(MlirParser.FunctionTypeContext context) {
        return context.children.get(2).getText();
    }
}

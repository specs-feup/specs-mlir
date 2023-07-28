package pt.up.fe.specs.mlir.grammar.operations;

import pt.up.fe.specs.mlir.grammar.MlirParser;

import java.util.List;

public class OperationUtils {

    public static List<MlirParser.OpResultContext> results(MlirParser.OperationContext context) {
        return context.opResultList().opResult();
    }

    public static String name(MlirParser.OperationContext context) {
        return context.genericOperation().name.getText();
    }

    public static List<MlirParser.SuccessorContext> successors(MlirParser.OperationContext context) {
        return context.genericOperation().successorList().successor();
    }
}

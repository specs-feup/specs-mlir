package pt.up.fe.specs.mlir.grammar.operations;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import pt.up.fe.specs.mlir.antlr.AntlrUtils;
import pt.up.fe.specs.mlir.grammar.MlirParser;

public class OperationTest {
    @Test
    public void testSimpleOperationNoArgs() {
        String code = "%result = \"foo_div\"() : () -> (f32, i32)";

        var node = ((MlirParser.OperationContext) AntlrUtils.parse(code, "operation"));

        Assertions.assertEquals(node.opResultList().opResult(), "%result");
    }
}

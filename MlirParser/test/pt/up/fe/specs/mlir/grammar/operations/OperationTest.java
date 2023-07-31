package pt.up.fe.specs.mlir.grammar.operations;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import pt.up.fe.specs.mlir.antlr.AntlrUtils;
import pt.up.fe.specs.mlir.grammar.MlirParser;

public class OperationTest {

    @Test
    public void testOperationTwoResults() {
        String code = "%result:2 = \"foo_div\"() : () -> (f32, i32)";

        var node = ((MlirParser.OperationContext) AntlrUtils.parse(code, "operation"));

        Assertions.assertEquals(OperationUtils.name(node), "\"foo_div\"");
    }

    @Test
    public void testOperationPrettyResults() {
        String code = "%foo, %bar = \"foo_div\"() : () -> (f32, i32)";

        var node = ((MlirParser.OperationContext) AntlrUtils.parse(code, "operation"));
    }

    @Test
    public void testOperationTwoInputsOneAttribute() {
        String code = "%2 = \"tf.scramble\"(%result#0, %bar) <{fruit = \"banana\"}> : (f32, i32) -> f32";

        var node = ((MlirParser.OperationContext) AntlrUtils.parse(code, "operation"));
    }

    @Test
    public void testOperationDiscardableAttributes() {
        String code = "%foo, %bar = \"foo_div\"() {some_attr = \"value\", other_attr = 42 : i64} : () -> (f32, i32)";

        var node = ((MlirParser.OperationContext) AntlrUtils.parse(code, "operation"));
    }
}

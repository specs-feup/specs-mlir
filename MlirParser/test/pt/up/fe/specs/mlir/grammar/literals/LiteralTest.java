package pt.up.fe.specs.mlir.grammar.literals;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import pt.up.fe.specs.mlir.antlr.AntlrUtils;
import pt.up.fe.specs.mlir.grammar.MlirParser;

public class LiteralTest {

    @Test
    public void testIntegerLiteral() {
        var intLit = ((MlirParser.IntegerLiteralContext) AntlrUtils.parse("10230", "integerLiteral"));
        Assertions.assertEquals("10230:false", intLit.value.getText() + ":" + intLit.isHexadecimal);

        var hexLit = ((MlirParser.IntegerLiteralContext) AntlrUtils.parse("0x10230", "integerLiteral"));
        Assertions.assertEquals("0x10230:true", hexLit.value.getText()+":"+hexLit.isHexadecimal);
    }

    @Test
    public void testFloatingLiteral() {
        var floatLit = ((MlirParser.FloatLiteralContext) AntlrUtils.parse("-10230.034E-230", "floatLiteral"));
        Assertions.assertEquals("-10230.034E-230", floatLit.value.getText());
    }

    @Test
    public void testStringLiteral() {
        var stringLit = ((MlirParser.StringLiteralContext) AntlrUtils.parse("\"toy.transpose\"", "stringLiteral"));
        Assertions.assertEquals("\"toy.transpose\"", stringLit.value.getText());
    }
}

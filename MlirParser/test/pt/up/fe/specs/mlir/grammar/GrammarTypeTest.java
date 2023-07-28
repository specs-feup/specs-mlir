package pt.up.fe.specs.mlir.grammar;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import pt.up.fe.specs.mlir.antlr.AntlrUtils;

public class GrammarTypeTest {

    @Test
    public void testNoneType() {
        var node = ((MlirParser.NoneTypeContext) AntlrUtils.parse("none", "noneType"));

        Assertions.assertEquals("none", node.value.getText());
    }

    @Test
    public void testIndexType() {
        var node = ((MlirParser.IndexTypeContext) AntlrUtils.parse("index", "indexType"));

        Assertions.assertEquals("index", node.value.getText());
    }

    @Test
    public void testFloatType() {
        var nodeF16  = ((MlirParser.FloatTypeContext) AntlrUtils.parse("f16", "floatType"));
        var nodeBF16 = ((MlirParser.FloatTypeContext) AntlrUtils.parse("bf16", "floatType"));
        var nodeF32  = ((MlirParser.FloatTypeContext) AntlrUtils.parse("f32", "floatType"));
        var nodeF64  = ((MlirParser.FloatTypeContext) AntlrUtils.parse("f64", "floatType"));

        Assertions.assertEquals("f16", nodeF16.value.getText());
        Assertions.assertEquals("bf16", nodeBF16.value.getText());
        Assertions.assertEquals("f32", nodeF32.value.getText());
        Assertions.assertEquals("f64", nodeF64.value.getText());
    }

    @Test
    public void testIntegerType() {
        var signedIntegerNode = ((MlirParser.SignedIntegerTypeContext) AntlrUtils.parse("si64", "signedIntegerType"));
        var unsignedIntegerNode = ((MlirParser.UnsignedIntegerTypeContext) AntlrUtils.parse("ui64", "unsignedIntegerType"));
        var signlessIntegerNode = ((MlirParser.SignlessIntegerTypeContext) AntlrUtils.parse("i64", "signlessIntegerType"));

        String signedWidth = signedIntegerNode.value.getText();
        String unsignedWidth = unsignedIntegerNode.value.getText();
        String signlessWidth = signlessIntegerNode.value.getText();

        Assertions.assertEquals(signedWidth, "si64");
        Assertions.assertEquals(unsignedWidth, "ui64");
        Assertions.assertEquals(signlessWidth, "i64");
    }

    @Test
    public void testComplexType() {
        // TODO: add tests for 'complex' type
    }

    @Test
    public void testTupleType() {
        // TODO: add tests for 'tuple' type
    }

}

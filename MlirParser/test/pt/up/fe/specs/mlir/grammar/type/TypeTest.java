package pt.up.fe.specs.mlir.grammar.type;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import pt.up.fe.specs.mlir.antlr.AntlrUtils;
import pt.up.fe.specs.mlir.grammar.MlirParser;

public class TypeTest {

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
    public void testFunctionTypeNoArgsNoReturn() {
        var node = ((MlirParser.FunctionTypeContext) AntlrUtils.parse("() -> ()", "functionType"));

        Assertions.assertEquals(TypeUtils.args(node), "()");
        Assertions.assertEquals(TypeUtils.rets(node), "()");
    }

    @Test
    public void testFunctionTypeNoArgsSingleReturn() {
        var node = ((MlirParser.FunctionTypeContext) AntlrUtils.parse("() -> f32", "functionType"));

        Assertions.assertEquals(TypeUtils.args(node), "()");
        Assertions.assertEquals(TypeUtils.rets(node), "f32");
    }

    @Test
    public void testFunctionTypeNoArgsListReturn() {
        var node = ((MlirParser.FunctionTypeContext) AntlrUtils.parse("() -> (f32, i32)", "functionType"));

        Assertions.assertEquals(TypeUtils.args(node), "()");
        Assertions.assertEquals(TypeUtils.rets(node), "(f32,i32)");
    }

    @Test
    public void testFunctionTypeSingleArgSingleReturn() {
        var node = ((MlirParser.FunctionTypeContext) AntlrUtils.parse("f32 -> f32", "functionType"));

        Assertions.assertEquals(TypeUtils.args(node), "f32");
        Assertions.assertEquals(TypeUtils.rets(node), "f32");
    }

    @Test
    public void testFunctionTypeSingleArgListReturn() {
        var node = ((MlirParser.FunctionTypeContext) AntlrUtils.parse("f32 -> (f32, i32)", "functionType"));

        Assertions.assertEquals(TypeUtils.args(node), "f32");
        Assertions.assertEquals(TypeUtils.rets(node), "(f32,i32)");
    }

    @Test
    public void testFunctionTypeListArgsNoReturn() {
        var node = ((MlirParser.FunctionTypeContext) AntlrUtils.parse("(f32, i32) -> ()", "functionType"));

        Assertions.assertEquals(TypeUtils.args(node), "(f32,i32)");
        Assertions.assertEquals(TypeUtils.rets(node), "()");
    }

    @Test
    public void testFunctionTypeListArgsSingleReturn() {
        var node = ((MlirParser.FunctionTypeContext) AntlrUtils.parse("(f32, i32) -> f32", "functionType"));

        Assertions.assertEquals(TypeUtils.args(node), "(f32,i32)");
        Assertions.assertEquals(TypeUtils.rets(node), "f32");
    }

    @Test
    public void testFunctionTypeListArgsListReturn() {
        var node = ((MlirParser.FunctionTypeContext) AntlrUtils.parse("(f32, i32) -> (f32, i32)", "functionType"));

        Assertions.assertEquals(TypeUtils.args(node), "(f32,i32)");
        Assertions.assertEquals(TypeUtils.rets(node), "(f32,i32)");
    }

    @Test
    public void testComplexType() {
        // TODO: add tests for 'complex' type
    }

    @Test
    public void testTupleType() {
        // TODO: add tests for 'tuple' type
    }

    @Test
    public void testUnrankedTensorType() {
        var node = ((MlirParser.TensorTypeContext) AntlrUtils.parse("tensor<*xf32>", "tensorType"));

        Assertions.assertEquals(TypeUtils.dimlist(node), "*x");
        Assertions.assertEquals(TypeUtils.elemtype(node), "f32");
    }

    @Test
    public void testRankedTensorType() {
        var node = ((MlirParser.TensorTypeContext) AntlrUtils.parse("tensor<2x3xf32>", "tensorType"));

        Assertions.assertEquals(TypeUtils.dimlist(node), "2x3x");
        Assertions.assertEquals(TypeUtils.elemtype(node), "f32");
    }
}

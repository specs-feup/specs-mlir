package pt.up.fe.specs.mlir.grammar.blocks;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import pt.up.fe.specs.mlir.antlr.AntlrUtils;
import pt.up.fe.specs.mlir.grammar.MlirParser;

public class BlockTest {

    @Test
    public void testValueIdAndType() {
        var node = ((MlirParser.ValueIdAndTypeContext) AntlrUtils.parse("%a: i64", "valueIdAndType"));

        Assertions.assertEquals("%a", node.valueId.getText());
        Assertions.assertEquals("i64", node.valueType.getText());
    }

    @Test
    public void testValueIdAndTypeList() {
        var node = ((MlirParser.ValueIdAndTypeListContext) AntlrUtils.parse("%a: i64, %b: i64", "valueIdAndTypeList"));

        var a = node.values.get(0);
        var b = node.values.get(1);

        Assertions.assertEquals("%a", a.valueId.getText());
        Assertions.assertEquals("i64", a.valueType.getText());

        Assertions.assertEquals("%b", b.valueId.getText());
        Assertions.assertEquals("i64", b.valueType.getText());
    }

    @Test
    public void testBlockArgList() {
        var node = ((MlirParser.BlockArgListContext) AntlrUtils.parse("(%a: i64, %b: i64)", "blockArgList"));

        var a = node.args.values.get(0);
        var b = node.args.values.get(1);

        Assertions.assertEquals("%a", a.valueId.getText());
        Assertions.assertEquals("i64", a.valueType.getText());

        Assertions.assertEquals("%b", b.valueId.getText());
        Assertions.assertEquals("i64", b.valueType.getText());
    }

    @Test
    public void testBlockLabel() {
        var node = ((MlirParser.BlockLabelContext) AntlrUtils.parse("^bb0(%a: i64, %b: i64):", "blockLabel"));

        var blockId = node.blockId.getText();
        var args = node.blockArgList().args;
        var a = args.values.get(0);
        var b = args.values.get(1);

        Assertions.assertEquals("^bb0", blockId);
        Assertions.assertEquals(2, args.values.size());
        Assertions.assertEquals("%a", a.valueId.getText());
        Assertions.assertEquals("i64", a.valueType.getText());
        Assertions.assertEquals("%b", b.valueId.getText());
        Assertions.assertEquals("i64", b.valueType.getText());
    }

    @Test
    public void testBlock() {
        String code = """
                ^bb0(%a: i64, %cond: i1): // Code dominated by ^bb0 may refer to %a
                   %3 = "toy.reshape"(%2) : (tensor<6xf64>) -> tensor<2x3xf64> loc("test/Examples/Toy/Ch2/codegen.toy":10:3)
                   %4 = "toy.reshape"(%2) : (tensor<6xf64>) -> tensor<2x3xf64> loc("test/Examples/Toy/Ch2/codegen.toy":10:3)""";

        var node = ((MlirParser.BlockContext) AntlrUtils.parse(code, "block"));

        var label = node.blockLabel().getText();
        var op1 = node.operation().get(0).getText();
        var op2 = node.operation().get(1).getText();

        Assertions.assertEquals("^bb0(%a:i64,%cond:i1):", label);
        Assertions.assertEquals("%3=\"toy.reshape\"(%2):(tensor<6xf64>)->tensor<2x3xf64>loc(\"test/Examples/Toy/Ch2/codegen.toy\":10:3)", op1);
        Assertions.assertEquals("%4=\"toy.reshape\"(%2):(tensor<6xf64>)->tensor<2x3xf64>loc(\"test/Examples/Toy/Ch2/codegen.toy\":10:3)", op2);
    }
}

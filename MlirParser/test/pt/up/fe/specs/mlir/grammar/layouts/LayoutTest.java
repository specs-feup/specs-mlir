package pt.up.fe.specs.mlir.grammar.layouts;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import pt.up.fe.specs.mlir.antlr.AntlrUtils;
import pt.up.fe.specs.mlir.grammar.MlirParser;

public class LayoutTest {
    @Test
    public void dimensionTest() {
    }

    @Test
    public void rankedDimensionTest() {
        var n1 = ((MlirParser.DimensionListRankedContext) AntlrUtils.parse("2x3x4x", "dimensionListRanked"));
        var n2 = ((MlirParser.DimensionListRankedContext) AntlrUtils.parse("?x?x4x", "dimensionListRanked"));

        Assertions.assertEquals(n1.getText(), "2x3x4x");
        Assertions.assertEquals(n2.getText(), "?x?x4x");
    }

    @Test
    public void unrankedDimensionTest() {
        var node = ((MlirParser.DimensionListUnrankedContext) AntlrUtils.parse("*x", "dimensionListUnranked"));

        Assertions.assertEquals(node.getText(), "*x");
    }

    @Test
    public void strideListTest() {
        var node = ((MlirParser.StrideListContext) AntlrUtils.parse("[1, ?, 3]", "strideList"));

        Assertions.assertEquals(node.getText(), "[1,?,3]");
    }

    @Test
    public void stridedLayoutTest() {
        var node = ((MlirParser.StridedLayoutContext) AntlrUtils.parse("offset: 5, strides: [1,3]", "stridedLayout"));

        var dimension = node.dimension().getText();
        var strideList = node.strideList().getText();

        Assertions.assertEquals(node.getText(), "offset:5,strides:[1,3]");
        Assertions.assertEquals(dimension, "5");
        Assertions.assertEquals(strideList, "[1,3]");
    }
}

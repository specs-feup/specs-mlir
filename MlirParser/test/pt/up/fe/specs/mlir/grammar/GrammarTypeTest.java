package pt.up.fe.specs.mlir.grammar;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import pt.up.fe.specs.mlir.antlr.AntlrUtils;

public class GrammarTypeTest {

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
}

package pt.up.fe.specs.mlir.grammar;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import pt.up.fe.specs.mlir.antlr.AntlrUtils;

public class GrammarDictionaryTest {
    @Test
    public void testAttributeEntry() {
        var node = ((MlirParser.AttributesEntryContext) AntlrUtils.parse("fruit = \"banana\"", "attributesEntry"));

        Assertions.assertEquals("fruit", node.attributesProperty().value.getText());
        Assertions.assertEquals("\"banana\"", node.children.get(2).getText());
    }

    @Test
    public void testDictionaryAttribute() {
        // TODO: FIX THIS TEST!
        // This is allowed but not supported.
        String code = "{some_attr = \"value\", other_attr = 42 : i64}";

        var node = ((MlirParser.DictionaryAttributeContext) AntlrUtils.parse(code, "dictionaryAttribute"));
        var firstAttribute = node.attributesEntry().get(0);
        var secondAttribute = node.attributesEntry().get(2);

        Assertions.assertEquals("some_attr", firstAttribute.attributesProperty().value.getText());
        Assertions.assertEquals("\"value\"", firstAttribute.children.get(2).getText());
    }

    @Test
    public void testDictionaryProperties() {
        String code = "<{fruit = \"banana\"}>";

        var node = ((MlirParser.DictionaryPropertiesContext) AntlrUtils.parse(code, "dictionaryProperties"));

        var attribute = node.dictionaryAttribute().attributesEntry().get(0);

        Assertions.assertEquals("fruit", TestUtils.attributeProperty(attribute));
        Assertions.assertEquals("\"banana\"", TestUtils.attributeValue(attribute));
    }

}

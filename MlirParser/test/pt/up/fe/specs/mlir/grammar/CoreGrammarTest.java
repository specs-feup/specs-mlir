/**
 * Copyright 2023 SPeCS.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with
 * the License. You may obtain a copy of the License at
 * 
 * http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on
 * an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the
 * specific language governing permissions and limitations under the License. under the License.
 */

package pt.up.fe.specs.mlir.grammar;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import pt.up.fe.specs.mlir.antlr.AntlrUtils;

public class CoreGrammarTest {



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

    /*
    @Test
    public void testBareId() {
        var node = ((MlirParser.BareIdContext) AntlrUtils.parse("toy.transpose", "bareId"));
        Assertions.assertEquals("toy.transpose", node.value.getText());
    }
     */

    @Test
    public void testBareIdList() {
        var node = ((MlirParser.BareIdListContext) AntlrUtils.parse("toy.transpose, aslkdj, _as23_$.asdas", "bareIdList"));
        Assertions.assertEquals("toy.transpose, aslkdj, _as23_$.asdas", TestUtils.tokensText(node.values));
    }

    /*
    @Test
    public void testValueId() {
        var node = ((MlirParser.ValueIdContext) AntlrUtils.parse("%02034203", "valueId"));
        Assertions.assertEquals("%02034203", node.value.getText());
    }
     */

    @Test
    public void testAliasName() {
        var node = ((MlirParser.AliasNameContext) AntlrUtils.parse("toy.transpose", "aliasName"));
        Assertions.assertEquals("toy.transpose", node.value.getText());
    }

    @Test
    public void testSymbolRefId() {
        var node = ((MlirParser.SymbolRefIdContext) AntlrUtils.parse("@12::@\"foo\"::@30", "symbolRefId"));
        Assertions.assertEquals("@12, @\"foo\", @30", TestUtils.tokensText(node.values));
    }

    @Test
    public void testValueIdList() {
        var node = ((MlirParser.ValueIdListContext) AntlrUtils.parse("%_20, %00, %-a", "valueIdList"));
        Assertions.assertEquals("%_20, %00, %-a", TestUtils.tokensText(node.values));
    }

    @Test
    public void testValueUse() {
        var node = ((MlirParser.ValueUseContext) AntlrUtils.parse("%01", "valueUse"));
        Assertions.assertEquals("%01", node.value.getText());

        node = ((MlirParser.ValueUseContext) AntlrUtils.parse("%_as2#1023", "valueUse"));
        Assertions.assertEquals("%_as2#1023", node.value.getText() + "#" + node.number.getText());
    }

    @Test
    public void testValueUseList() {
        var node = ((MlirParser.ValueUseListContext) AntlrUtils.parse("%01, %_as2#1023", "valueUseList"));
        Assertions.assertEquals("%01, %_as2#1023", TestUtils.nodesText(node.values));
    }


}

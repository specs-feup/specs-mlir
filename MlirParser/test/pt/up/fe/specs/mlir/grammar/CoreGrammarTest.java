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

    @Test
    public void testLocation() {
        var node = ((MlirParser.KnownLocationContext) AntlrUtils.parse("\"test/Examples/Toy/Ch2/codegen.toy\":11:11", "location"));
        Assertions.assertEquals("\"test/Examples/Toy/Ch2/codegen.toy\":11:11", node.file.getText()+":"+node.line.getText()+":"+node.col.getText());
    }

    @Test
    public void testTrailingLocation() {
        var parent = ((MlirParser.TrailingLocationContext) AntlrUtils.parse("loc(\"test/Examples/Toy/Ch2/codegen.toy\":11:11)", "trailingLocation"));
        var node = (MlirParser.KnownLocationContext)  parent.location();
        Assertions.assertEquals("\"test/Examples/Toy/Ch2/codegen.toy\":11:11", node.file.getText()+":"+node.line.getText()+":"+node.col.getText());
    }

    @Test
    public void testOperation() {
        var node  = ((MlirParser.OperationContext) AntlrUtils.parse(" %3 = \"toy.reshape\"(%2) : (tensor<6xf64>) -> tensor<2x3xf64> loc(\"test/Examples/Toy/Ch2/codegen.toy\":10:3)", "operation"));
    }


}

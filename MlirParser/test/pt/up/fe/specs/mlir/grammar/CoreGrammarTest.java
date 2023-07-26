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

import org.antlr.v4.gui.TreeViewer;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import pt.up.fe.specs.mlir.antlr.AntlrUtils;

import javax.swing.*;
import java.util.Arrays;
import java.util.concurrent.ExecutionException;
import java.util.stream.Collectors;

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

    @Test
    public void testBareId() {
        var node = ((MlirParser.BareIdContext) AntlrUtils.parse("toy.transpose", "bareId"));
        Assertions.assertEquals("toy.transpose", node.value.getText());
    }

    @Test
    public void testBareIdList() {
        var node = ((MlirParser.BareIdListContext) AntlrUtils.parse("toy.transpose, aslkdj, _as23_$.asdas", "bareIdList"));
        Assertions.assertEquals("toy.transpose, aslkdj, _as23_$.asdas", node.values.stream().map(t -> t.getText()).collect(Collectors.joining(", ")));
    }

    @Test
    public void testAliasName() {
        var node = ((MlirParser.AliasNameContext) AntlrUtils.parse("toy.transpose", "aliasName"));
        Assertions.assertEquals("toy.transpose", node.bareId().value.getText());
    }
}

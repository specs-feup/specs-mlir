/**
 * Copyright 2021 SPeCS.
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

package pt.up.fe.specs.mlir.parser;

import static org.junit.Assert.fail;

import org.junit.Test;

import pt.up.fe.specs.util.SpecsIo;
import pt.up.fe.specs.util.utilities.TestResources;

public class MlirParserTest {

    private static final TestResources TEST_RESOURCES = new TestResources("pt/up/fe/specs/mlir/parser");

    public static void testParser(String resourceName) {
        var resource = TEST_RESOURCES.getResource(resourceName);
        var parser = new MlirParser(SpecsIo.resourceToStream(resource.getResource()));
        try {
            var root = parser.Root();
            root.dump(" ");
        } catch (ParseException e) {
            e.printStackTrace();
            fail(e.getMessage());
        }
    }

    @Test
    public void test() {
        testParser("llvm_intrinsic.mlir");
    }

}

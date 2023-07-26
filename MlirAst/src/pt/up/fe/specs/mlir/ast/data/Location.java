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

package pt.up.fe.specs.mlir.ast.data;

public class Location {

    private final int lineStart;
    private final int lineEnd;
    private final int colStart;
    private final int colEnd;

    public Location(int lineStart, int lineEnd, int colStart, int colEnd) {
        this.lineStart = lineStart;
        this.lineEnd = lineEnd;
        this.colStart = colStart;
        this.colEnd = colEnd;
    }

    /**
     * @return the lineStart
     */
    public int getLineStart() {
        return lineStart;
    }

    /**
     * @return the lineEnd
     */
    public int getLineEnd() {
        return lineEnd;
    }

    /**
     * @return the colStart
     */
    public int getColStart() {
        return colStart;
    }

    /**
     * @return the colEnd
     */
    public int getColEnd() {
        return colEnd;
    }

}

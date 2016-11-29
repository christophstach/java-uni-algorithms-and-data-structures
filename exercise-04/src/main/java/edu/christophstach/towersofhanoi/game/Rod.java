/*
 * Copyright (c) 2016 Christoph Stach <christoph.stach@gmail.com>
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy of this software and associated documentation files (the "Software"), to deal in the Software without restriction, including without limitation the rights to use, copy, modify, merge, publish, distribute, sublicense, and/or sell copies of the Software, and to permit persons to whom the Software is furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM, OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE SOFTWARE.
 */

package edu.christophstach.towersofhanoi.game;

import java.util.Stack;

/**
 * @author Christoph Stach - s0555912@htw-berlin.de
 * @since 11/27/16
 */
class Rod extends Stack<Disk> {


    /**
     * Checks if it is possible to put the disk on the rod
     *
     * @param disk The disk
     * @return True if it is possible
     */
    public boolean canPutDisk(Disk disk) {
        return this.isEmpty() || disk.getSize() < this.peek().getSize();
    }

    /**
     * Builds the string representation of the Rod
     *
     * @return The string representation of the Rod
     */
    @Override
    public String toString() {
        String str = "";

        for (int i = 0; i < this.elementCount; i++) {
            str += this.elementAt(this.size() - 1 - i) + "\n";
        }

        return str;
    }
}

/*
 * Copyright (c) 2016 Christoph Stach <christoph.stach@gmail.com>
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy of this software and associated documentation files (the "Software"), to deal in the Software without restriction, including without limitation the rights to use, copy, modify, merge, publish, distribute, sublicense, and/or sell copies of the Software, and to permit persons to whom the Software is furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM, OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE SOFTWARE.
 */

package exercise;

import data.Program;
import data.Student;
import stack.Stack;
import stack.Stackable;

/**
 * @author Christoph Stach - s0555912@htw-berlin.de
 * @since 18.10.2016
 */
public class Application {
    /**
     * Haupt methode
     *
     * @param args commandline args
     */
    public static void main(String[] args) {
        Student[] students = new Student[]{
            new Student(555912, "Christoph", "Stach", Program.APPLIED_COMPUTING, 1),
            new Student(555913, "Miles", "Lorenz", Program.APPLIED_COMPUTING, 2),
            new Student(555914, "Steffen", "Exler", Program.APPLIED_COMPUTING, 3)
        };


        Stackable<Student> stack = new Stack<>();

        stack.push(students[0]);
        stack.push(students[1]);
        stack.push(students[2]);

        stack.printAll();

        System.out.println("Size: " + stack.size());
        System.out.println("Pop: " + stack.pop());
        System.out.println("Size: " + stack.size());
        System.out.println("Empty: " + stack.empty());
        System.out.println("Peak: " + stack.peak());

        stack.pop();
        stack.pop();

        System.out.println("Size: " + stack.size());
        System.out.println("Empty: " + stack.empty());
    }
}
/*
 * Copyright (c) 2016 Christoph Stach <christoph.stach@gmail.com>
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy of this software and associated documentation files (the "Software"), to deal in the Software without restriction, including without limitation the rights to use, copy, modify, merge, publish, distribute, sublicense, and/or sell copies of the Software, and to permit persons to whom the Software is furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM, OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE SOFTWARE.
 */

package edu.christophstach.list;

import edu.christophstach.list.comparator.Comparable;
import edu.christophstach.list.comparator.LastNameComparator;
import edu.christophstach.list.data.Gender;
import edu.christophstach.list.data.Program;
import edu.christophstach.list.data.Student;
import edu.christophstach.list.list.DoublyLinkedList;
import edu.christophstach.list.list.Listable;
import edu.christophstach.list.list.sort.SelectionSort;
import edu.christophstach.list.list.sort.Sortable;

/**
 * @author Christoph Stach - s0555912@htw-berlin.de
 * @since 12/14/16
 */
public class ManualTest {
    /**
     * Entry point for the application
     *
     * @param args Console arguments
     */
    public static void main(String[] args) {
        Listable<Student> list = new DoublyLinkedList<>();

        Sortable<Student> sortable = new SelectionSort<>();
        Comparable comparable = new LastNameComparator();

        list.insertFirst(new Student(5559123, "Christoph", "Stach", Program.APPLIED_COMPUTING, Gender.MALE));
        list.insertFirst(new Student(5559124, "Laura", "Hartgers", Program.APPLIED_COMPUTING, Gender.FEMALE));
        list.insertFirst(new Student(5559125, "Miles", "Lorenz", Program.APPLIED_COMPUTING, Gender.MALE));
        list.insertFirst(new Student(5559126, "Steffen", "Exler", Program.APPLIED_COMPUTING, Gender.MALE));
        list.insertFirst(new Student(5559127, "Laila", "Westphal", Program.APPLIED_COMPUTING, Gender.FEMALE));


        System.out.println("\n\nAfter sort\n\n");
        list.printAll();

        list.sort(sortable, comparable);

        System.out.println("\n\nAfter sort\n\n");
        list.printAll();
    }
}
package com.java.coding.problems.chapter2;

import java.util.List;

/**
 * Chapter 2 no.44
 * Checking the index in the range from 0 to length:
 * Write a program that checks whether the given index is between 0 (inclusive) and the given length (exclusive).
 * If the given index is out of the [0, given length] range, then throw IndexOutOfBoundsException.
 */
public class CheckIndex {

    public static void checkIndexOutOfBounds(int index, List<Integer> numbers) {
        if (index > numbers.size() - 1) {
            throw new IndexOutOfBoundsException(String.format("Current Index: %d ", index)
                    .concat("is out of bound!"));
        }
    }

}

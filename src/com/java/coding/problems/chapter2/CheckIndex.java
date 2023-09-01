package com.java.coding.problems.chapter2;

/**
 * Chapter 2 no.44
 * Checking the index in the range from 0 to length:
 * Write a program that checks whether the given index is between 0 (inclusive) and the given length (exclusive).
 * If the given index is out of the [0, given length] range, then throw IndexOutOfBoundsException.
 */
public class CheckIndex {

    private static final int LOCAL_UPPER_BOUND = 10; // Assuming the upper bound index for this class is 10

    public static void checkIndexOutOfBounds(int index) {
        // User can only check the index in range 0 (inclusive) to 10 eExclusive)
        // in Java 9+ can be changed to Objects.checkIndex
        if (index < 0 || index >= LOCAL_UPPER_BOUND) {
            throw new IndexOutOfBoundsException(String.format("Current Index: %d ", index)
                    .concat("is out of bound!"));
        }
        System.out.println("Check completed");
    }

}

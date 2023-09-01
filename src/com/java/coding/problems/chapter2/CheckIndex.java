package com.java.coding.problems.chapter2;

public class CheckIndex {

    private static final int LOCAL_UPPER_BOUND = 10; // Assuming the upper bound index for this class is 10

    /**
     * Chapter 2 no.44
     * Checking the index in the range from 0 to length:
     * Write a program that checks whether the given index is between 0 (inclusive) and the given length (exclusive).
     * If the given index is out of the [0, given length] range, then throw IndexOutOfBoundsException.
     */
    public static void checkIndexOutOfBounds(int index) {
        // User can only check the index in range 0 (inclusive) to 10 (exclusive)
        // in Java 9+ can be changed to Objects.checkIndex
        if (index < 0 || index >= LOCAL_UPPER_BOUND) {
            throw new IndexOutOfBoundsException(String.format("Current Index: %d ", index)
                    .concat("is out of bound!"));
        }
        System.out.println("Check completed");
    }

    /**
     * Chapter 2 no.45
     * Checking the subrange in the range from 0 to length:
     * Write a program that checks whether the given subrange [given start, given end]
     * is within the bounds of the range from [0, given length].
     * If the given subrange is not in the [0, given length] range, then throw IndexOutOfBoundsException.
     */
    public static void checkSubRangeOutOfBounds(int startIndex, int endIndex) {
        // User can only check the subrange in range 0 (inclusive) to 10 (exclusive)
        // in Java 9+ can be changed to Objects.checkFromToIndex
        if (startIndex < 0 || startIndex >= endIndex || endIndex >= LOCAL_UPPER_BOUND) {
            throw new IndexOutOfBoundsException(String.format("Current Subrange: [%d]-[%d] ", startIndex, endIndex)
                    .concat("is out of bound!"));
        }
        System.out.println("Check completed");
    }
}

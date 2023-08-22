package com.java.coding.problems.chapter1;

/**
 * This is Solution to Chapter 1 no.37
 * Next floating-point value:
 * Write a program that returns the next floating-point adjacent to
 * the given float/double value in the direction of positive and negative infinity.
 */
public class MultiplyLargeNumber {

    public static void multiply(int num1, int num2) {
        Integer result = Math.multiplyExact(num1, num2);
        System.out.println(result);
    }
}

package com.java.coding.problems.chapter1;

/**
 * This is Solution to Chapter 1 no.37
 * Multiplying two large int/long values and operation overflow:
 * Write a program that multiplies two large int/long values
 * and throws an arithmetic exception in the case of operation overflow.
 */
public class MultiplyLargeNumber {

    public static void multiply(int num1, int num2) {
        Integer result = Math.multiplyExact(num1, num2);
        System.out.println(result);
    }
}

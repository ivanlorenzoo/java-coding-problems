package com.java.coding.problems.chapter1;

/**
 * This is Solution to Chapter 1 no.26
 * Summing two large int/long numbers and operation overflow:
 * Write a program that sums two large int/long numbers
 * and throws an arithmetic exception in the case of an operation overflow.
 */
public class SumLargeNumber {

    public static void sum() {
        // The problem is to shows that
        // There is a problem using sum() or + operation in standard way of application
        // To catch error of something that might break for long or int
        // using something like addExact can be used instead
        Long total = Math.addExact(Long.MAX_VALUE, Long.MAX_VALUE);
        System.out.println(total);
    }
}

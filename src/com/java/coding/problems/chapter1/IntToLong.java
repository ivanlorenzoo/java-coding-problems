package com.java.coding.problems.chapter1;

/**
 * This is Solution to Chapter 1 no.28
 * Converting into a number by an unsigned conversion:
 * Write a program that converts a given int number into long by an unsigned conversion.
 */
public class IntToLong {

    public static void unsignedConversion(int num) {
        // Example usage of conversion
        Long numConverted = Integer.toUnsignedLong(num);
        System.out.println(numConverted);
    }

}

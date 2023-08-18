package com.java.coding.problems.chapter1;

import java.math.BigInteger;

/**
 * This is Solution to Chapter 1 no.33
 * Converting BigInteger into a primitive type:
 * Write a program that extracts the primitive type value from the given BigInteger.
 */
public class BigIntegerConverter {

    public static void convert(BigInteger number) {
        int convertedNumber = number.intValue();
        System.out.println(convertedNumber);
    }
}

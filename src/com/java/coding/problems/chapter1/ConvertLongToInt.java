package com.java.coding.problems.chapter1;

/**
 * This is Solution to Chapter 1 no.34
 * Converting long into int:
 * Write a program that converts long into int
 */
public class ConvertLongToInt {

    public static void convert(long number) {
        int convertedNumber = Math.toIntExact(number);
        System.out.println(convertedNumber);
    }
}

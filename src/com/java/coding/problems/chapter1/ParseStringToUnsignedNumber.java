package com.java.coding.problems.chapter1;

/**
 * This is Solution to Chapter 1 no.27
 * String as an unsigned number in the radix:
 * Write a program that parses the given string into an unsigned number (int or long) in the given radix
 */
public class ParseStringToUnsignedNumber {

    public static void parse(String text) {
        // Just another example for using parseUnsignedInt
        Integer num = Integer.parseUnsignedInt(text);
        System.out.println(num);
    }
}

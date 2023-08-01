package com.java.coding.problems.chapter1;

/**
 * This is Solution to Chapter 1 no.8
 * Checking that a string contains a substring:
 * Write a program that checks whether the given string contains the given substring.
 */
public class SubstringChecker {

    public static void check(String text, String subString) {
        boolean isContainingSubstring = text.contains(subString);
        System.out.println(isContainingSubstring);
    }
}

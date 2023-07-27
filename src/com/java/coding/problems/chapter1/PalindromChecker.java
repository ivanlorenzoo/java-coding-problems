package com.java.coding.problems.chapter1;

/**
 * This is Solution to Chapter 1 no.11
 * Checking whether a string is a palindrome:
 * Write a program that determines whether the given string is a palindrome or not
 */
public class PalindromChecker {

    public static void checkPalindrome(String text) {
        /*
            can be implemented using recursive
         */
        StringBuilder stringBuilder = new StringBuilder(text);
        stringBuilder.reverse();
        boolean isPalindrome = stringBuilder.toString().equals(text);
        System.out.println(isPalindrome);
    }
}

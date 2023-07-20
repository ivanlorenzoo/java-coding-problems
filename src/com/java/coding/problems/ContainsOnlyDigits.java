package com.java.coding.problems;

/**
 * This is Solution to Chapter 1 no.4
 * Checking whether a string contains only digits::
 * Write a program that checks whether the given string contains only digits
 */
public class ContainsOnlyDigits {

    public static void isOnlyDigits(String text) {
        boolean isOnlyDigits = true;
        for (int i = 0; i < text.length() - 1; i++) {
            Character character = text.charAt(i);
            if (!Character.isDigit(character)) {
                isOnlyDigits = false;
                break;
            }
        }
        System.out.println("The given string: " + text + " is only digits = " + isOnlyDigits);
    }
}

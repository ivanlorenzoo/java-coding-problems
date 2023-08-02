package com.java.coding.problems.chapter1;

/**
 * This is Solution to Chapter 1 no.17
 * Counting substring occurrences a string:
 * Write a program that counts the occurrences of a given string in another given string.
*/
public class SubstringOccurrence {

    public static void count(String text, String subString) {
        String currentText = "";
        int count = 0;
        int begin = 0;
        int end = subString.length();
        while (end <= text.length()) {
            currentText = text.substring(begin, end);
            if (currentText.equals(subString)) {
                count++;
            }
            begin++;
            end++;
        }
        System.out.println(subString + " has: " + count + " occurences in: " + text);
    }

}

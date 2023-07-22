package com.java.coding.problems.chapter1;

/**
 * This is Solution to Chapter 1 no.6
 * Counting occurrences of a certain character:
 * Write a program that counts the occurrences of a certain character in a given string.
*/
public class CountingOccurrenceCharacter {

    public static void count(String text, Character charOccurrence) {
        int characterOccurrenceCount = 0;
        for(int i = 0; i < text.length(); i++) {
            if (charOccurrence.equals(text.charAt(i))) {
                characterOccurrenceCount++;
            }
        }
        System.out.println(charOccurrence + " has appeared: " + characterOccurrenceCount + " times in " + text);
    }
}

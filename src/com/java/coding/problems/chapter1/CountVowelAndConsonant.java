package com.java.coding.problems.chapter1;

import java.util.ArrayList;
import java.util.List;

/**
 * This is Solution to Chapter 1 no.5
 * Counting vowels and consonants:
 * Write a program that counts the number of vowels and consonants in a given string.
 * Do this for the English language, which has five vowels (a, e, i, o, and u).
 */
public class CountVowelAndConsonant {

    public static void count(String text) {
        String textLowerCase = text.toLowerCase();

        List<Character> vowels = new ArrayList<>();
        vowels.add('a');
        vowels.add('i');
        vowels.add('u');
        vowels.add('e');
        vowels.add('o');

        int vowelCount = 0;
        int consonantCount = 0;
        for (int i = 0; i < textLowerCase.length(); i++) {
            Character character = textLowerCase.charAt(i);
            if (vowels.contains(character)) {
                vowelCount++;
            } else {
                consonantCount++;
            }
        }
        System.out.println(text + " has: " + vowelCount + " vowels, " + consonantCount + " consonants.");
    }
}

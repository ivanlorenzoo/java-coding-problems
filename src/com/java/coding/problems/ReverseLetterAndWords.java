package com.java.coding.problems;

import java.util.ArrayList;
import java.util.List;
import java.util.StringJoiner;

/**
 * This is Solution to Chapter 1 no.3
 * Reversing letters and words:
 * Write a program that reverses the letters of each word
 * and a program that reverses the letters of each word and the words themselves
 */
public class ReverseLetterAndWords {

    public static void reverse(String sentences) {
        List<Character> reversed = new ArrayList<>();
        for (int i = sentences.length() - 1; i >= 0; i--) {
            reversed.add(sentences.charAt(i));
        }
        StringBuilder stringBuilder = new StringBuilder(reversed.size());
        for (Character character : reversed) {
            stringBuilder.append(character);
        }
        System.out.println(stringBuilder);
    }
}

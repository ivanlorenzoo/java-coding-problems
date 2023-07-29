package com.java.coding.problems.chapter1;

import java.util.HashMap;
import java.util.Map;

/**
 * This is Solution to Chapter 1 no.12
 * Removing duplicate characters:
 * Write a program that removes the duplicate characters from the given string
 */
public class RemoveDuplicateCharacter {

    public static void remove(String text) {
        Map<Character, Integer> mappedCharacter = new HashMap<>();
        String result = "";
        StringBuilder textResult = new StringBuilder(result);
        for (int i = 0; i < text.length(); i++) {
            if (!mappedCharacter.containsKey(text.charAt(i))) {
                mappedCharacter.put(text.charAt(i), 1);
                textResult.append(text.charAt(i));
            } else {
                // this code does nothing actually but it can give the info of what char is duplicate
                mappedCharacter.put(text.charAt(i), mappedCharacter.get(text.charAt(i)) + 1);
            }
        }
        System.out.println(textResult);
    }
}

package com.java.coding.problems;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * This is Solution to Chapter 1 no.1
 * Counting duplicate characters:
 * Write a program that counts duplicate characters from a given string.
 */
public class DuplicateCharacters {

    public static void count(String text) {
        HashMap<String, Integer> characterMapping = new HashMap<>();
        for (int i = 0; i < text.length(); i++) {
            int numOfDuplicate;
            String mappedChar = String.valueOf(text.charAt(i));
            if (characterMapping.isEmpty() || !characterMapping.containsKey(mappedChar)) {
                characterMapping.put(mappedChar, 1);
            } else {
                numOfDuplicate = characterMapping.get(mappedChar);
                characterMapping.put(mappedChar, ++numOfDuplicate);
            }
        }
        Map<String, Integer> dupiicatedCharacters = characterMapping.entrySet().stream()
                .filter(x -> x.getValue() >= 2)
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));
        System.out.println(dupiicatedCharacters);
    }

}

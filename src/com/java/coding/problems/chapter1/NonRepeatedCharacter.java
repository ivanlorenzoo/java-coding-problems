package com.java.coding.problems.chapter1;

import java.util.LinkedHashMap;
import java.util.Map;

/**
 * This is Solution to Chapter 1 no.2
 * Finding the first non-repeated character:
 * Write a program that returns the first non-repeated character from a given string.
 */
public class NonRepeatedCharacter {

    public static void findFirst(String text) {
        LinkedHashMap<String, Integer> characterMapping = new LinkedHashMap<>();
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
        for (Map.Entry<String, Integer> entry : characterMapping.entrySet()) {
            Integer value = entry.getValue();
            if (value == 1) {
                System.out.println("The first non repeated character is: " + entry.getKey());
                break;
            }
        }
    }
}

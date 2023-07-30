package com.java.coding.problems.chapter1;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class FindMostAppearance {

    public static void find(String text) {
        Map<Character, Integer> characterAppearances = new HashMap<>();
        for (int i = 0; i < text.length(); i++) {
            Character mappedCharacter = text.charAt(i);
            if (characterAppearances.get(mappedCharacter) == null) {
                characterAppearances.put(mappedCharacter, 1);
            } else {
                int updatedAppearanceValue = characterAppearances.get(mappedCharacter) + 1;
                characterAppearances.put(mappedCharacter, updatedAppearanceValue);
            }
        }
        // If the string has one or more key value pairs then it will only return one of them
        System.out.println(Collections.max(characterAppearances.entrySet(), Map.Entry.comparingByValue()).getKey());
    }
}

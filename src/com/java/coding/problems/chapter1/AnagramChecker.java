package com.java.coding.problems.chapter1;

import java.util.Arrays;

/**
 * This is Solution to Chapter 1 no.18
 * Checking whether two strings are anagrams:
 * Write a program that checks1 whether two strings are anagrams.
 * Consider that an anagram of a string is a permutation of this string by ignoring capitalization and white spaces.
 */
public class AnagramChecker {

    public static void checkAnagram(String firstString, String secondString) {
        boolean flag = false;
        if (firstString != secondString) {
            System.out.println(flag);
        }

        firstString = firstString.toLowerCase().trim();
        secondString = secondString.toLowerCase().trim();

        char[] firstText = firstString.toCharArray();
        Arrays.sort(firstText);

        char[] secondText = secondString.toCharArray();
        Arrays.sort(secondText);

        for (int i = 0; i < firstText.length; i++) {
            if (firstText[i] != secondText[i]) {
                System.out.println(flag);
            }
        }
        flag = true;
        System.out.println(flag);
    }

}

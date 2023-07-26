package com.java.coding.problems.chapter1;

/**
 * This is Solution to Chapter 1 no.10
 * Generating all permutations::
 * Write a program that generates all permutations of a given string.
 */
public class GeneratePermutation {

    public static void getPermutation(String text) {
        permute(text, "");
    }

    private static void permute(String s, String answer) {
        if (s.length() == 0) {
            System.out.print(answer + '\n');
            return;
        }

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            String left_substr = s.substring(0, i);
            String right_substr = s.substring(i + 1);
            String rest = left_substr + right_substr;
            permute(rest, answer + ch);
        }
    }
}

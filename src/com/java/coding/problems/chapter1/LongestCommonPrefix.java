package com.java.coding.problems.chapter1;

import java.util.List;

/**
 * This is Solution to Chapter 1 no.22
 * Finding the longest common prefix:
 * Write a program that finds the longest common prefix of given strings.
 */
public class LongestCommonPrefix {

    public static void find(List<String> texts) {
        String longestCommonPrefix = "";
        if (texts.isEmpty()) {
            System.out.println("LongestCommonPrefix: " + longestCommonPrefix);
        }

        if (texts.size() == 1) {
            System.out.println("LongestCommonPrefix: " + texts.get(0));
        }

        longestCommonPrefix = texts.get(0);
        for (int i = 1; i < texts.size(); i++) {
            while (texts.get(i).indexOf(longestCommonPrefix) != 0) {
                longestCommonPrefix = longestCommonPrefix.substring(0, longestCommonPrefix.length()-1);

                if (longestCommonPrefix.isEmpty()) {
                    System.out.println("No longestCommonPrefix was found");
                    return;
                }
            }
        }
        System.out.println(longestCommonPrefix);
    }
}

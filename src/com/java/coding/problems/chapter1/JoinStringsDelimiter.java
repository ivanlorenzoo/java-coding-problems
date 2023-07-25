package com.java.coding.problems.chapter1;

import java.util.ArrayList;
import java.util.List;

/**
 * This is Solution to Chapter 1 no.9
 * Joining multiple strings with a delimiter:
 * Write a program that joins the given strings by the given delimiter.
 */
public class JoinStringsDelimiter {

    public static void joinString(List<String> words, Character delimiter) {
        StringBuilder joinedString = new StringBuilder();
        int counter = 0;
        for (String word : words) {
            if (counter == words.size() -1) {
                joinedString.append(word);
            } else {
                joinedString.append(word).append(delimiter);
            }
            counter++;
        }
        System.out.println(joinedString);
    }
}

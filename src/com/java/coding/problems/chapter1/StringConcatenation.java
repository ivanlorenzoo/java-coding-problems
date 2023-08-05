package com.java.coding.problems.chapter1;

/**
 * This is Solution to Chapter 1 no.20
 * Concatenating the same string n times: 
 * Write a program that concatenates the same string a given number of times
 */
public class StringConcatenation {

    public static void joinString(String text, int times) {
        String result = text;
        for (int i = 0; i < times-1; i++) {
            result = result.concat(text);
        }
        System.out.println(result);
    }
}

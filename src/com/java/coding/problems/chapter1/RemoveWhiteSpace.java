package com.java.coding.problems.chapter1;

/**
 * This is Solution to Chapter 1 no.8
 * Removing white spaces from a string:
 * Write a program that removes all white spaces from the given string.
 */
public class RemoveWhiteSpace {

    public static void removeSpace(String text) {
        //Recommended to use regex if the character to replace has complex patter
        String textNoSpace = text.replace(" ", "");
        System.out.println(textNoSpace);
    }
}

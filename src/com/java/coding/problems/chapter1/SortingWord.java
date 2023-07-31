package com.java.coding.problems.chapter1;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * This is Solution to Chapter 1 no.15
 * Sorting an array of strings by length:
 * Write a program that sorts by the length of the given array of strings.
 */
public class SortingWord {

    public static void sortByLength(List<String> words) {
        words.sort(Comparator.comparingInt(String::length).reversed());
        System.out.println(words);
    }
}

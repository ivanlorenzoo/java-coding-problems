package com.java.coding.problems.chapter1;

import java.util.stream.Stream;

/**
 * This is Solution to Chapter 1 no.24
 * Transforming strings:
 * Write several snippets of code to transform a string into another string.
 */
public class TransformingString {

    public static void transform(String from, String to) {
        // The result is looked through the solution
        // The piece of code itself just to show a way to manipulate string
        // in such a way to customize way of changing some string to other preffered formats
        String resultMap = Stream.of(from)
                .map(String::toUpperCase)
                .map(s -> s.replaceAll(from, to))
                .findFirst()
                .get();
        System.out.println(resultMap);
    }
}

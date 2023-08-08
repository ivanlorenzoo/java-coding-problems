package com.java.coding.problems.chapter1;

/**
 * This is Solution to Chapter 1 no.23
 * Applying indentation:
 * Write several snippets of code to apply indentation to the given text.
 */
public class Indentation {

    public static void apply(String text) {
        // The solution propose solution in jdk 12
        // this solution might not be the best,
        // but the number of space can be specified via adding new parameter to the method
        String indentation = "    ";
        System.out.println(indentation.concat(text));
    }
}

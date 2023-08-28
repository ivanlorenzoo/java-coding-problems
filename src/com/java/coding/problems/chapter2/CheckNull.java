package com.java.coding.problems.chapter2;

import java.util.List;
import java.util.Objects;

/**
 * This is Solution to Chapter 2 no.40
 * Checking null references in functional style and imperative code:
 * Write a program that performs the null checks on the given references
 * in a functional style and imperative code.
 */
public class CheckNull {

    public static void checkWithFunctionalStyle(List<Integer> num) {
        // this method show the usage of Objects.isNull to check the object is null or not
        // there are other method like the usual == null operator
        boolean test = num == null;
        System.out.println(Objects.isNull(num));
    }

}

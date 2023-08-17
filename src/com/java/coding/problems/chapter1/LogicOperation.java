package com.java.coding.problems.chapter1;

/**
 * This is Solution to Chapter 1 no.32
 * Applying logical AND/OR/XOR to two boolean expressions:
 * Write a program that applies the logical AND/OR/XOR to two boolean expressions.
 */
public class LogicOperation {

    public static void AndOperation(boolean flag1, boolean flag2) {
        System.out.println(flag1 && flag2);
    }

    public static void OrOperation(boolean flag1, boolean flag2) {
        System.out.println(flag1 || flag2);
    }

    public static void XorOperation(boolean flag1, boolean flag2) {
        // eq to (flag1 && !flag2) || (!flag1 && flag2)
        System.out.println(flag1 ^ flag2);
    }

}

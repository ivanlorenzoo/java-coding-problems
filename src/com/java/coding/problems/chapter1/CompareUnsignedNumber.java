package com.java.coding.problems.chapter1;

/**
 * This is Solution to Chapter 1 no.29
 * Comparing two unsigned numbers:
 * Write a program that compares the given two numbers as unsigned.
 */
public class CompareUnsignedNumber {

    public static void compare(Integer num1, Integer num2) {
        if (Integer.compareUnsigned(num1,num2) == 0) {
            System.out.println("is equal");
        } else if (Integer.compareUnsigned(num1,num2) > 0) {
            System.out.println(num1 + " is greater than " + num2);
        } else {
            System.out.println(num2 + " is greater than " + num1);
        }
    }
}

package com.java.coding.problems.chapter1;

/**
 * This is Solution to Chapter 1 no.25
 * Computing the minimum and maximum of two numbers:
 * Write a program that returns the minimum and maximum of two numbers
 */
public class MaxMin {

    public static void computeMaxMin(int num1, int num2) {
        // the code solution shows the usage of min max comparison
        // but the problem to show the usage of it should be more descriptive
        // because the problem itself can be done by comparing the two number,
        // which the lesser one will be min and the bigger one will be max
        // the min max might be useful to use it for sorting algorithm for arrays of number for example
        int min = Math.min(num1, num2);
        int max = Math.max(num1, num2);
        System.out.println("min: " + min + " max: " + max);
    }

}

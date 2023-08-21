package com.java.coding.problems.chapter1;

/**
 * This is Solution to Chapter 1 no.35
 * Next floating-point value:
 * Write a program that returns the next floating-point adjacent to
 * the given float/double value in the direction of positive and negative infinity.
 */
public class NextFloatingPoint {

    public static void nextAdjacentValue(double start, double direction) {
        System.out.println(Math.nextAfter(start, direction));
    }
}

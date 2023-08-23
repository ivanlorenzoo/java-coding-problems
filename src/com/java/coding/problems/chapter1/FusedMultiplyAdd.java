package com.java.coding.problems.chapter1;

/**
 * This is Solution to Chapter 1 no.38
 * Fused Multiply Add (FMA):
 * Write a program that takes three float/double values (a, b, c)
 * and computes a * b + c in an efficient way.
 */
public class FusedMultiplyAdd {

    /**
     * The basic arithmetic calculation for FMA
     * This supposed to be slower than {@link #calculateFusedMultiplyAdd(double, double, double)} ()}
     * @param a first value
     * @param b second value
     * @param c third value
     *
     * formula : a * b + c
     */
    @Deprecated
    public static void calculateFma(double a, double b, double c) {
        long startTimeCalculation = System.nanoTime();
        double fmaResult = a * b + c;
        long endTimeCalculation = System.nanoTime();

        System.out.println("Result: " + fmaResult
                + " Common arithmetic operation time: "
                + (endTimeCalculation - startTimeCalculation));
    }

    public static void calculateFusedMultiplyAdd(double a, double b, double c) {
        // implementation using Java 8+ version
    }

}

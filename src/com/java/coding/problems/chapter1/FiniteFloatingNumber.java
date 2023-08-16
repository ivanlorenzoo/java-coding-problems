package com.java.coding.problems.chapter1;

/**
 * This is Solution to Chapter 1 no.31
 * double/float is a finite floating-point value:
 * Write a program that determines whether the given double/float value is a finite floating-point value.
 */
public class FiniteFloatingNumber {

    public static void isFiniteNumber(Float number) {
        System.out.println(Float.isFinite(number));
    }

    public static void isFiniteNumber(Double number) {
        System.out.println(Double.isFinite(number));
    }

}

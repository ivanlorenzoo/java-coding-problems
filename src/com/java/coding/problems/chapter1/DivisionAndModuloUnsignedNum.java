package com.java.coding.problems.chapter1;

/**
 * This is Solution to Chapter 1 no.30
 * Division and modulo of unsigned values:
 * Write a program that computes the division and modulo of the given unsigned value.
 */
public class DivisionAndModuloUnsignedNum {

    public static void division(int num1, int num2) {
        Integer result = Integer.divideUnsigned(num1, num2);
        System.out.println(result);
    }

    public static void modulo(int num1, int num2) {
        Integer result = Integer.remainderUnsigned(num1, num2);
        System.out.println(result);
    }

}

package com.java.coding.problems.chapter1;

/**
 * This is Solution to Chapter 1 no.35
 * Computing the floor of a division and modulus:
 * Write a program that computes the floor division
 * and the floor modulus of the given dividend (x) and divisor (y).
 */
public class FloorDivisionModulus {

    public static void floorDivision(int x, int y) {
        int floorDivisionResult = Math.floorDiv(x,y);
        System.out.println(floorDivisionResult);
    }

    public static void floorMod(int x, int y) {
        int floorModResult = Math.floorMod(x, y);
        System.out.println(floorModResult);
    }
}

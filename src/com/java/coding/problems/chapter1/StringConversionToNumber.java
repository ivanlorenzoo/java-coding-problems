package com.java.coding.problems.chapter1;

/**
 * This is Solution to Chapter 1 no.7
 * Converting String into int, long, float, or double:
 * Write a program that converts the given String object (representing a number)
 * into int, long, float, or double.
 */
public class StringConversionToNumber {

    public static void convert(String number) {
        /*
         * Assuming that the number will always in number format
         * Then the idea is to check whether the current String is a round number or precision
         * for precision number it could be float or double: then what to do is check the boundaries of the number
         * for round number it could be integer or long: then what to do is check the boundaries of the number also
         *
         * in term of real world usage: it is best to store the value for the worst possible case which in this case
         * we should store in long or double if there is a possibility that
         * the input can be higher than Float.MAX_VALUE or Integer.MAX_VALUE
         * So, for the sake of simplicity the validation is only for long and double
         *
         * Downside using this solution: high memory usage
         */
        if (number.contains(".")) {
            Double precisionNumber = Double.parseDouble(number);
            System.out.println(precisionNumber);
        } else {
            Long roundNumber = Long.parseLong(number);
            System.out.println(roundNumber);
        }
    }
}

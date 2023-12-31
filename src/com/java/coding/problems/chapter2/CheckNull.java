package com.java.coding.problems.chapter2;

import java.util.ArrayList;
import java.util.InvalidPropertiesFormatException;
import java.util.List;
import java.util.Objects;

public class CheckNull {

    /**
     * Chapter 2 no.40
     * Checking null references in functional style and imperative code:
     * Write a program that performs the null checks on the given references
     * in a functional style and imperative code.
     */
    public static void checkWithFunctionalStyle(List<Integer> numbers) {
        // this method show the usage of Objects.isNull to check the object is null or not
        // there are other method like the usual == null operator
        System.out.println(Objects.isNull(numbers));
    }

    /**
     * Chapter 2 no.41
     * Checking null references and throwing a customized NullPointerException error:
     * Write a program that performs the null checks on the given references
     * and throws NullPointerException with custom messages.
     */
    public static void checkNullThrowNullPointer(List<Integer> numbers) {
        if (numbers == null) {
            throw new NullPointerException("Null list of number");
        }
    }

    /**
     * Chapter 2 no.42
     * Checking null references and throwing the specified exception (example, IllegalArgumentException):
     * Write a program that performs the null checks on the given references and throws the specified exception.
     */
    public static void checkNullThrowCustomException(List<Integer> numbers) throws InvalidPropertiesFormatException {
        if (numbers == null) {
            throw new InvalidPropertiesFormatException("Null Integer list cannot be accepted as argument");
        }
    }

    /**
     * Chapter 2 no.43
     * Checking null references and returning non-null default references:
     * Write a program that performs the null checks on the given reference,
     * and if it is non-null, then return it; otherwise, return a non-null default reference.
     */
    public static void checkNullDefault(List<Integer> numbers) {
        System.out.println(Objects.requireNonNullElseGet(numbers, ArrayList::new));
    }
}

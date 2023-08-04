package com.java.coding.problems.chapter1;

/**
 * This is Solution to Chapter 1 no.19
 * Declaring multiline strings (text blocks):
 * Write a program that declares multiline strings or text blocks.
 */
public class DeclareMultilineString {

    public static void printStringBlock() {
        String text = String.format("%s"  + "%s" + "%s" +  "%s",
                "My high school, ",
                "the Illinois Mathematics and Science Academy,",
                "showed me that anything is possible ",
                "and that you're never too young to think big.");
        System.out.println(text);
    }

}

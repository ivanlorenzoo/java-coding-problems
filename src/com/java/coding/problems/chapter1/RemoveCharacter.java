package com.java.coding.problems.chapter1;

/**
 * This is Solution to Chapter 1 no.13
 * Removing given characters:
 * Write a program that removes the given character from the given string.
 */
public class RemoveCharacter {

    public static void remove(String text, Character character) {
        text = text.replaceAll(character.toString(), "");
        System.out.println(text);
    }
}

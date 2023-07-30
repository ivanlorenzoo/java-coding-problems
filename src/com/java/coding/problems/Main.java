package com.java.coding.problems;

import com.java.coding.problems.chapter1.*;
import com.java.coding.problems.util.WordsGenerator;

public class Main {
    public static void main(String[] args) {
        /* Chapter 1 */
        // no. 1
        DuplicateCharacters.count("aaiueuoa"); //should be {a=3, u=2}
        // no. 2
        NonRepeatedCharacter.findFirst("ababcddefeg"); //should be c
        // no. 3
        ReverseLetterAndWords.reverse("Hello World"); //should be dlroW olleH
        // no. 4
        ContainsOnlyDigits.isOnlyDigits("1234x5"); //should be false
        // no. 5
        CountVowelAndConsonant.count("aiueojkl"); //should be 5 vowels and 3 consonants.
        // no. 6
        CountingOccurrenceCharacter.count("test123", 'a'); //should be 0 in given string
        // no. 7
        StringConversionToNumber.convert("123.4");//should be 123.4
        // no. 8
        RemoveWhiteSpace.removeSpace("Hello W o r l d");//should be HelloWorld
        // no. 9
        JoinStringsDelimiter.joinString(WordsGenerator.generateCodingIsFun(), '\\'); //should be Coding\is\fun
        // no. 10
        GeneratePermutation.getPermutation("ABC"); //should be ABC ACB BAC BCA CAB CBA
        // no. 11
        PalindromChecker.checkPalindrome("aba"); //should be true
        // no. 12
        RemoveDuplicateCharacter.remove("abaccdddee"); //should be abcde
        // no. 13
        RemoveCharacter.remove("akbkc", 'k'); //should be abc
        // no. 14
        FindMostAppearance.find("ccharacter"); //should be c
    }
}

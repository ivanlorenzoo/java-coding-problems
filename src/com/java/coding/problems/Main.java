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
        // no. 15
        SortingWord.sortByLength(WordsGenerator.generateCodingIsFun()); //should be Coding, fun, is
        // no. 16
        SubstringChecker.check("banana", "ana"); //should be true
        // no. 17
        SubstringOccurrence.count("testtesttestabctest", "test"); //should be 4
        // no. 18
        AnagramChecker.checkAnagram("bla bla", "bal bal"); //should be true
        // no. 19
        DeclareMultilineString.printStringBlock(); //just prints out string with formatting
        // no. 20
        StringConcatenation.joinString("Hi", 3); //should be HiHiHi
        // no. 21
        RemoveSpaces.removeLeadingTrailingSpace(" Hello, World !"); //should be Hello,World!
        // no. 22
        LongestCommonPrefix.find(WordsGenerator.generateStringsWithCommonPrefix()); //should be Tra
        // no. 23
        Indentation.apply("Hi, Earth"); // should be "    Hi, Earth"
        // no. 24
        TransformingString.transform("Hello", "World");// should change Hello to Upper case and change O to World
        // no. 25
        MaxMin.computeMaxMin(-1,-2); //should be -2 as max and -1 as max
        // no. 26
        SumLargeNumber.sum(); //should throw error
    }
}

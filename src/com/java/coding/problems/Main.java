package com.java.coding.problems;

import com.java.coding.problems.chapter1.*;
import com.java.coding.problems.util.WordsGenerator;

public class Main {
    public static void main(String[] args) {
        DuplicateCharacters.count("aaiueuoa"); //should be {a=3, u=2}
        NonRepeatedCharacter.findFirst("ababcddefeg"); //should be c
        ReverseLetterAndWords.reverse("Hello World"); //should be dlroW olleH
        ContainsOnlyDigits.isOnlyDigits("1234x5"); //should be false
        CountVowelAndConsonant.count("aiueojkl"); //should be 5 vowels and 3 consonants.
        CountingOccurrenceCharacter.count("test123", 'a'); //should be 0 in given string
        StringConversionToNumber.convert("123.4");//should be 123.4
        RemoveWhiteSpace.removeSpace("Hello W o r l d");//should be HelloWorld
        JoinStringsDelimiter.joinString(WordsGenerator.generateCodingIsFun(), '\\'); //should be Coding\is\fun
        GeneratePermutation.getPermutation("ABC"); //should be ABC ACB BAC BCA CAB CBA
    }
}
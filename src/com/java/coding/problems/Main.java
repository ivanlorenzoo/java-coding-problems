package com.java.coding.problems;

import com.java.coding.problems.chapter1.*;
import com.java.coding.problems.util.WordsGenerator;

import java.math.BigInteger;
import java.text.ParseException;

public class Main {
    public static void main(String[] args) throws ParseException {
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
        // SumLargeNumber.sum(); //should throw error --uncomment this line to run
        // no. 27
        ParseStringToUnsignedNumber.parse("123456"); // should be 123456
        // no. 28
        IntToLong.unsignedConversion(56789); // should be 56789
        // no. 29
        CompareUnsignedNumber.compare(1,2); // 2 is greater than 1
        // no. 30
        DivisionAndModuloUnsignedNum.division(4,2); // 2
        DivisionAndModuloUnsignedNum.modulo(5,3); // 2
        // no. 31
        FiniteFloatingNumber.isFiniteNumber(2.15); // true
        // no. 32
        LogicOperation.AndOperation(true, true); // true
        LogicOperation.OrOperation(true, false); // true
        LogicOperation.XorOperation(false, false); // false
        // no. 33
        BigIntegerConverter.convert(BigInteger.valueOf(100)); // int = 100
        // no. 34
        ConvertLongToInt.convert(10000); // int = 10000
        // no. 35
        FloorDivisionModulus.floorDivision(10,3); // 3
        FloorDivisionModulus.floorMod(10,3); // 1
        // no. 36
        NextFloatingPoint.nextAdjacentValue(-1.1, -1.0); // should be -1.0999..
        // no. 37
        // MultiplyLargeNumber.multiply(9000000, 9000000); // should throw integer overflow --uncomment this line to run
        // no. 38
        FusedMultiplyAdd.calculateFma(10.999, 5.999, 3.999); // new implementation use Math.fma in Java 9
        // no. 39
        CompactNumberFormatting.convert("1000000");
    }
}

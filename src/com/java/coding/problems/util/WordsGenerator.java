package com.java.coding.problems.util;

import java.util.ArrayList;
import java.util.List;

public class WordsGenerator {

    public static List<String> generateCodingIsFun() {
        List<String> randomWords = new ArrayList<>();
        randomWords.add("Coding");
        randomWords.add("is");
        randomWords.add("fun");
        return randomWords;
    }

    public static List<String> generateStringsWithCommonPrefix() {
        List<String> prefixWords = new ArrayList<>();
        prefixWords.add("Trail");
        prefixWords.add("Train");
        prefixWords.add("Trade");
        return prefixWords;
    }
}

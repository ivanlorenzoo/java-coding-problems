package com.java.coding.problems.chapter1;

import com.java.coding.problems.util.NumberFormatters;
import java.text.NumberFormat;
import java.text.ParseException;
import java.util.Locale;

/**
 * This is Solution to Chapter 1 no.39
 * Compact number formatting:
 * Write a program that formats the number 1,000,000 to 1M (US locale) and to 1 mln (Italian locale).
 * In addition, parse 1M and 1 mln from a string into a number.
 */
public class CompactNumberFormatting {

    public static void convert(String number) throws ParseException {
        String italian = NumberFormatters.forLocaleStyle(Locale.ITALIAN, NumberFormat.Style.SHORT,
                Double.parseDouble(number));
        String english = NumberFormatters.forLocaleStyle(Locale.ENGLISH, NumberFormat.Style.SHORT,
                Double.parseDouble(number));
        System.out.println("Italian: " + italian + " English: " + english);
        Number italianBackToNumber = NumberFormatters.parseLocale(Locale.ITALIAN, italian);
        Number englishBackToNumber = NumberFormatters.parseLocale(Locale.ENGLISH, english);
        System.out.println("Italian back to number: " + italianBackToNumber
                + " English back to number: " + englishBackToNumber);
    }
}

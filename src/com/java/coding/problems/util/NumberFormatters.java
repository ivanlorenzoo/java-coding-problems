package com.java.coding.problems.util;

import java.math.RoundingMode;
import java.text.NumberFormat;
import java.text.ParseException;
import java.util.Locale;

public class NumberFormatters {
    public static String forLocale(Locale locale, double number) {
        return format(locale, NumberFormat.Style.SHORT, null, number);
    }

    public static String forLocaleStyle(
            Locale locale, NumberFormat.Style style, double number) {
        return format(locale, style, null, number);
    }

    public static String forLocaleStyleRound(
            Locale locale, NumberFormat.Style style, RoundingMode mode, double number) {
        return format(locale, style, mode, number);
    }

    private static String format(
            Locale locale, NumberFormat.Style style, RoundingMode mode, double number) {
        if (locale == null || style == null) {
            return String.valueOf(number); // or use a default format
        }
        NumberFormat nf = NumberFormat.getCompactNumberInstance(locale,
                style);
        if (mode != null) {
            nf.setRoundingMode(mode);
        }
        return nf.format(number);
    }

    public static Number parseLocale(Locale locale, String number)
            throws ParseException {
        return parse(locale, NumberFormat.Style.SHORT, false, number);
    }

    public static Number parseLocaleStyle(
            Locale locale, NumberFormat.Style style, String number) throws ParseException {
        return parse(locale, style, false, number);
    }

    public static Number parseLocaleStyleRound(
            Locale locale, NumberFormat.Style style, boolean grouping, String number)
            throws ParseException {
        return parse(locale, style, grouping, number);
    }

    private static Number parse(Locale locale, NumberFormat.Style style, boolean grouping, String number)
            throws ParseException {
        if (locale == null || style == null || number == null) {
            throw new IllegalArgumentException(
                    "Locale/style/number cannot be null");
        }
        NumberFormat nf = NumberFormat.getCompactNumberInstance(locale, style);
        nf.setGroupingUsed(grouping);
        return nf.parse(number);
    }
}

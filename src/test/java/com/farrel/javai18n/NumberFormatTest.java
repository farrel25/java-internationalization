package com.farrel.javai18n;

import org.junit.jupiter.api.Test;

import java.text.NumberFormat;
import java.text.ParseException;
import java.util.Locale;

public class NumberFormatTest {

    @Test
    void testNumberFormat() {
        NumberFormat numberFormat = NumberFormat.getInstance();
        String format = numberFormat.format(10000000.255);
        System.out.println(format); // 10,000,000.255
    }

    @Test
    void testNumberFormatIndonesia() {
        Locale localeID = new Locale("id", "ID");
        NumberFormat numberFormat = NumberFormat.getInstance(localeID);

        String format = numberFormat.format(10000000.255);
        System.out.println(format); // 10.000.000,255
    }

    @Test
    void testNumberFormatParseIndonesia() {
        Locale localeID = new Locale("id", "ID");
        NumberFormat numberFormat = NumberFormat.getInstance(localeID);

        try {
            Number result = numberFormat.parse("10.000.000,255");
            System.out.println(result); // 1.0000000255E7

            double resultDouble = result.doubleValue();
            System.out.println(resultDouble); // 1.0000000255E7

        } catch (ParseException e) {
            System.out.println(e.getMessage());
        }
    }
}

package com.farrel.javai18n;

import org.junit.jupiter.api.Test;

import java.text.NumberFormat;
import java.text.ParseException;
import java.util.Currency;
import java.util.Locale;

public class CurrencyTest {

    @Test
    void testCurrency() {
        Locale localeID = new Locale("id", "ID");
        Currency currency = Currency.getInstance(localeID);

        System.out.println("currency.getDisplayName(): " + currency.getDisplayName());
        System.out.println("currency.getCurrencyCode(): " + currency.getCurrencyCode());
        System.out.println("currency.getSymbol(localeID): " + currency.getSymbol(localeID));
        System.out.println("currency.getSymbol(): " + currency.getSymbol());
    }

    @Test
    void testCurrencyUS() {
        Locale localeUS = new Locale("en", "US");
        Currency currency = Currency.getInstance(localeUS);

        System.out.println("currency.getDisplayName(): " + currency.getDisplayName());
        System.out.println("currency.getCurrencyCode(): " + currency.getCurrencyCode());
        System.out.println("currency.getSymbol(localeUS): " + currency.getSymbol(localeUS));
        System.out.println("currency.getSymbol(): " + currency.getSymbol());
    }

    @Test
    void testCurrencyJP() {
        Locale localeJP = new Locale("ja", "JP");
        Currency currency = Currency.getInstance(localeJP);

        System.out.println("currency.getDisplayName(): " + currency.getDisplayName());
        System.out.println("currency.getCurrencyCode(): " + currency.getCurrencyCode());
        System.out.println("currency.getSymbol(localeJP): " + currency.getSymbol(localeJP));
        System.out.println("currency.getSymbol(): " + currency.getSymbol());
    }

    @Test
    void testNumberFormatCurrency() {
        Locale localeID = new Locale("id", "ID");
        NumberFormat numberFormat = NumberFormat.getCurrencyInstance(localeID);

        String format = numberFormat.format(1000000.456);
        System.out.println(format);
    }

    @Test
    void testNumberFormatCurrencyParse() {
        Locale localeID = new Locale("id", "ID");
        NumberFormat numberFormat = NumberFormat.getCurrencyInstance(localeID);

        try {
            Number result = numberFormat.parse("Rp1.000.000,46");
            System.out.println(result);

            double resultDouble = result.doubleValue();
            System.out.println(resultDouble);

        } catch (ParseException e) {
            //throw new RuntimeException(e);
            System.out.println(e.getMessage());
        }
    }
}

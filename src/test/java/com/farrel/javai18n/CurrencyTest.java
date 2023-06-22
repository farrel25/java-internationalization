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

        System.out.println("currency.getDisplayName(): " + currency.getDisplayName()); // Indonesian Rupiah
        System.out.println("currency.getCurrencyCode(): " + currency.getCurrencyCode()); // IDR
        System.out.println("currency.getSymbol(localeID): " + currency.getSymbol(localeID)); // Rp
        System.out.println("currency.getSymbol(): " + currency.getSymbol()); // IDR
    }

    @Test
    void testCurrencyUS() {
        Locale localeUS = new Locale("en", "US");
        Currency currency = Currency.getInstance(localeUS);

        System.out.println("currency.getDisplayName(): " + currency.getDisplayName()); // US Dollar
        System.out.println("currency.getCurrencyCode(): " + currency.getCurrencyCode()); // USD
        System.out.println("currency.getSymbol(localeUS): " + currency.getSymbol(localeUS)); // $
        System.out.println("currency.getSymbol(): " + currency.getSymbol()); // $
    }

    @Test
    void testCurrencyJP() {
        Locale localeJP = new Locale("ja", "JP");
        Currency currency = Currency.getInstance(localeJP);

        System.out.println("currency.getDisplayName(): " + currency.getDisplayName()); // Japanese Yen
        System.out.println("currency.getCurrencyCode(): " + currency.getCurrencyCode()); // JPY
        System.out.println("currency.getSymbol(localeJP): " + currency.getSymbol(localeJP)); // ￥
        System.out.println("currency.getSymbol(): " + currency.getSymbol()); // ¥
    }

    @Test
    void testNumberFormatCurrency() {
        Locale localeID = new Locale("id", "ID");
        NumberFormat numberFormat = NumberFormat.getCurrencyInstance(localeID);

        String format = numberFormat.format(1000000.456);
        System.out.println(format); // Rp1.000.000,46
    }

    @Test
    void testNumberFormatCurrencyParse() {
        Locale localeID = new Locale("id", "ID");
        NumberFormat numberFormat = NumberFormat.getCurrencyInstance(localeID);

        try {
            Number result = numberFormat.parse("Rp1.000.000,46");
            System.out.println(result); // 1000000.46

            double resultDouble = result.doubleValue();
            System.out.println(resultDouble); // 1000000.46

        } catch (ParseException e) {
            //throw new RuntimeException(e);
            System.out.println(e.getMessage());
        }
    }
}

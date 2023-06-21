package com.farrel.javai18n;

import org.junit.jupiter.api.Test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class DateFormatTest {

    @Test
    void testDateFormat() {
        String pattern = "EEEE, dd MMMM yyyy";
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);

        String format = simpleDateFormat.format(new Date());
        System.out.println("format: " + format); // Wednesday, 21 June 2023
    }

    @Test
    void testDateFormatIndonesia() {
        String pattern = "EEEE, dd MMMM yyyy";
        Locale localeID = new Locale("id", "ID");

        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern, localeID);

        String format = simpleDateFormat.format(new Date());
        System.out.println("format: " + format); // Rabu, 21 Juni 2023
    }

    @Test
    void testDateFormatJapan() {
        String pattern = "EEEE, dd MMMM yyyy";
        Locale localeJP = new Locale("ja", "JP");

        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern, localeJP);

        String format = simpleDateFormat.format(new Date());
        System.out.println("format: " + format); // 水曜日, 21 6月 2023 (read: Suiyōbi, 21 6 tsuki 2023)
    }

    @Test
    void testDateFormatParseIndonesia() {
        String pattern = "EEEE, dd MMMM yyyy";
        Locale localeID = new Locale("id", "ID");

        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern, localeID);

        try {
            Date date = simpleDateFormat.parse("Rabu, 21 Juni 2023");
            System.out.println("date: " + date); // Wed Jun 21 00:00:00 WIB 2023

        } catch (ParseException e) {
            //throw new RuntimeException(e);
            System.out.println(e.getMessage());
        }
    }

    @Test
    void testDateFormatParseJapan() {
        String pattern = "EEEE, dd MMMM yyyy";
        Locale localeJP = new Locale("ja", "JP");

        //SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern, localeJP);
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern, Locale.JAPAN);

        try {
            Date date = simpleDateFormat.parse("水曜日, 21 6月 2023");
            System.out.println("date: " + date); // Wed Jun 21 00:00:00 WIB 2023

        } catch (ParseException e) {
            //throw new RuntimeException(e);
            System.out.println(e.getMessage());
        }
    }
}

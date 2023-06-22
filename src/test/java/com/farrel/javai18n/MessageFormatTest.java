package com.farrel.javai18n;

import org.junit.jupiter.api.Test;

import java.text.MessageFormat;
import java.util.Locale;
import java.util.ResourceBundle;

public class MessageFormatTest {

    @Test
    void testMessageFormat() {
        String pattern = "Hai {0}, anda bisa mencari data pribadi anda dengan mengetikkan \"{0}\" di kolom pencarian.";

        MessageFormat messageFormat = new MessageFormat(pattern);
        String format = messageFormat.format(new Object[]{"Farrel"});

        System.out.println(format);

    }

    @Test
    void testMessageFormatResourceBundle() {
        Locale localeUS = new Locale("en", "US");
        ResourceBundle resourceBundle = ResourceBundle.getBundle("message", localeUS);

        String pattern = resourceBundle.getString("welcome.message");

        MessageFormat messageFormat = new MessageFormat(pattern);
        String format = messageFormat.format(new Object[]{"Farrel", "Semarang"});

        System.out.println(format);

    }

    @Test
    void testMessageFormatResourceBundleIndonesia() {
        Locale localeID = new Locale("id", "ID");
        ResourceBundle resourceBundle = ResourceBundle.getBundle("message", localeID);

        String pattern = resourceBundle.getString("welcome.message");

        MessageFormat messageFormat = new MessageFormat(pattern);
        String format = messageFormat.format(new Object[]{"Farrel", "Semarang"});

        System.out.println(format);

    }
}

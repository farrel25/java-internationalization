package com.farrel.javai18n;

import org.junit.jupiter.api.Test;

import java.text.MessageFormat;
import java.util.Date;
import java.util.Locale;
import java.util.ResourceBundle;

public class MessageFormatTypeTest {

    @Test
    void testMessageFormatTypeID() {
        Locale localeID = new Locale("id", "ID");
        ResourceBundle resourceBundle = ResourceBundle.getBundle("message", localeID);

        String pattern = resourceBundle.getString("status");

//        MessageFormat messageFormat = new MessageFormat(pattern); // Halo Farrel, saat ini hari 6/22/23, 8:01 AM, saldo anda yaitu 1,000,000
//        MessageFormat messageFormat = new MessageFormat(pattern, localeID); // Halo Farrel, saat ini hari 22/06/23 08.00, saldo anda yaitu 1.000.000
        MessageFormat messageFormat = new MessageFormat(pattern, localeID); // Halo Farrel, saat ini hari Kamis, 22 Juni 2023, saldo anda yaitu Rp1.000.000,00

        String format = messageFormat.format(new Object[]{
                "Farrel",
                new Date(),
                1000000
        });

        System.out.println(format);
    }

    @Test
    void testMessageFormatTypeUS() {
        Locale localeUS = new Locale("en", "US");
        ResourceBundle resourceBundle = ResourceBundle.getBundle("message", localeUS);

        String pattern = resourceBundle.getString("status");

        MessageFormat messageFormat = new MessageFormat(pattern, localeUS); // Hi Farrel, it is Thursday, 22 June 2023, your balance is $1,000,000.00

        String format = messageFormat.format(new Object[]{
                "Farrel",
                new Date(),
                1000000
        });

        System.out.println(format);
    }
}

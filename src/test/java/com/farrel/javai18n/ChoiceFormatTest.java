package com.farrel.javai18n;

import org.junit.jupiter.api.Test;

import java.text.ChoiceFormat;
import java.text.MessageFormat;
import java.util.Locale;
import java.util.ResourceBundle;

public class ChoiceFormatTest {

    @Test
    void testChoiceFormat() {
        String pattern = "-1#negatif | 0#kosong | 1#satu | 1<banyak";

        ChoiceFormat choiceFormat = new ChoiceFormat(pattern);

        System.out.println(choiceFormat.format(-15));
        System.out.println(choiceFormat.format(-1));
        System.out.println(choiceFormat.format(0));
        System.out.println(choiceFormat.format(1));
        System.out.println(choiceFormat.format(12));
    }

    @Test
    void testChoiceFormatInMessageFormat() {
        Locale localeID = new Locale("id", "ID");
        ResourceBundle resourceBundle = ResourceBundle.getBundle("message", localeID);

        String pattern = resourceBundle.getString("balance");

        MessageFormat messageFormat = new MessageFormat(pattern, localeID);

        System.out.println(messageFormat.format(new Object[]{-1000000})); // Total saldo : -Rp1.000.000,00 Hutang
        System.out.println(messageFormat.format(new Object[]{0})); // Total saldo : Rp0,00 Kosong
        System.out.println(messageFormat.format(new Object[]{1000000})); // Total saldo : Rp1.000.000,00 Tersedia
    }

    @Test
    void testChoiceFormatInMessageFormatUnitedStatesOfAmerica() {
        Locale localeUS = new Locale("en", "US");
        ResourceBundle resourceBundle = ResourceBundle.getBundle("message", localeUS);

        String pattern = resourceBundle.getString("balance");

        MessageFormat messageFormat = new MessageFormat(pattern, localeUS);

        System.out.println(messageFormat.format(new Object[]{-1000000})); // Total balance : -$1,000,000.00 Debt
        System.out.println(messageFormat.format(new Object[]{0})); // Total balance : $0.00 Zero
        System.out.println(messageFormat.format(new Object[]{1000000})); // Total balance : $1,000,000.00 Available
    }
}

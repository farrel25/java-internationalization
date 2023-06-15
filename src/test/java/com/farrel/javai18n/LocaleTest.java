package com.farrel.javai18n;

import org.junit.jupiter.api.Test;

import java.util.Locale;

public class LocaleTest {

    @Test
    void testNewLocaleId() {
        String language = "id";
        String country = "ID";

        Locale locale = new Locale(language, country);

        System.out.println("locale.getLanguage(): " + locale.getLanguage());
        System.out.println("locale.getCountry(): " + locale.getCountry());

        System.out.println("locale.getDisplayLanguage(): " + locale.getDisplayLanguage());
        System.out.println("locale.getDisplayCountry(): " + locale.getDisplayCountry());
    }

    @Test
    void testNewLocaleUs() {
        String language = "en";
        String country = "US";

        Locale locale = new Locale(language, country);

        System.out.println("locale.getLanguage(): " + locale.getLanguage());
        System.out.println("locale.getCountry(): " + locale.getCountry());

        System.out.println("locale.getDisplayLanguage(): " + locale.getDisplayLanguage());
        System.out.println("locale.getDisplayCountry(): " + locale.getDisplayCountry());
    }
}

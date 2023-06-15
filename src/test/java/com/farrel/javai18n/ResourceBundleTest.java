package com.farrel.javai18n;

import org.junit.jupiter.api.Test;

import java.util.Locale;
import java.util.Objects;
import java.util.ResourceBundle;

public class ResourceBundleTest {

    @Test
    void testResourceBundle() {
        ResourceBundle resourceBundle = ResourceBundle.getBundle("message");

        System.out.println(resourceBundle.getString("hello"));
        System.out.println(resourceBundle.getString("goodbye"));
    }

    @Test
    void testResourceBundleIndonesia() {
        Locale indonesia = new Locale("id", "ID");
        ResourceBundle resourceBundle = ResourceBundle.getBundle("message", indonesia);

        System.out.println(resourceBundle.getString("hello"));
        System.out.println(resourceBundle.getString("goodbye"));
    }

    @Test
    void testResourceBundleNotFound() {
        Locale unitesStates = new Locale("en", "US");
        ResourceBundle resourceBundle = ResourceBundle.getBundle("message", unitesStates);

        System.out.println(resourceBundle.getString("hello"));
        System.out.println(resourceBundle.getString("goodbye"));
    }

    @Test
    void testResourceBundleMultipleTimes() {
        Locale unitesStates = new Locale("en", "US");
        ResourceBundle resourceBundle1 = ResourceBundle.getBundle("message", unitesStates);
        ResourceBundle resourceBundle2 = ResourceBundle.getBundle("message", unitesStates);

        System.out.println(resourceBundle1 == resourceBundle2);
        System.out.println(resourceBundle1.equals(resourceBundle2));
        System.out.println(Objects.equals(resourceBundle1, resourceBundle2));
    }
}

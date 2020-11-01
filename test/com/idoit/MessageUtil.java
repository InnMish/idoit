package com.idoit;

public class MessageUtil {

    public static String formatAssertMessage(String expected, String actual) {
        return "\n\nОжидаемый вывод: \n\n" + expected + " \n\nВаш вывод: \n\n" + actual + "\n\n";
    }
}

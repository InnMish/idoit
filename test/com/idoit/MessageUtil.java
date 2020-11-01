package com.idoit;

public class MessageUtil {

    public static String formatAssertMessagePrint(String expected, String actual) {
        return String.format("\n\nОжидаемый вывод: \n\n%s\n\nВаш вывод: \n\n%s\n\n", expected, actual);
    }

    public static String formatAssertMessage(String expected, String actual) {
        return String.format("\n\nОжидается: \n\n%s\n\nУ вас: \n\n%s\n\n", expected, actual);
    }
}

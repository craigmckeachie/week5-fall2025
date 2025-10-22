package com.pluralsight;

public class StringUtilities {
    public static String capitalize(String word) {
        if (word == null || word.isEmpty()) return word;
        return word.substring(0, 1).toUpperCase() + word.substring(1).toLowerCase();
    }

    // 5. Repeat a string a given number of times
    public static String repeat(String text, int times) {
        if (text == null || times <= 0) return "";
        return text.repeat(times);
    }
}

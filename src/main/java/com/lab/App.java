package com.lab;

public class App {

    public static int countVowels(String text) {
        if (text == null) {
            throw new IllegalArgumentException(
                    "String must not be null");
        }

        int count = 0;
        String value = text.toLowerCase();

        for (int i = 0; i < value.length(); i++) {
            char ch = value.charAt(i);

            if (ch == 'a' || ch == 'e' || ch == 'i'
                    || ch == 'o' || ch == 'u') {
                count++;
            }
        }

        return count;
    }

    public static void main(String[] args) {
        String text = "Hello World";

        System.out.println("String: " + text);
        System.out.println("Number of vowels: "
                + countVowels(text));
    }
}
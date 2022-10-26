package itmo.lab5;

import java.util.Collections;

public class Task2 {
    public static void main(String[] args) {
        String text = "Level";
        char[] array = text.toLowerCase().toCharArray();

        isPalindromeUsingStringBuilder(text);
    }

    public static void isPalindromeUsingStringBuilder(String text) {
        String clean = text.replaceAll("\\s+", "").toLowerCase();
        StringBuilder plain = new StringBuilder(clean);
        StringBuilder reverse = plain.reverse();
        if (plain == reverse) {
            System.out.println("Это слово палиндром");
        } else {
            System.out.println("Это слово не палиндром");
        }
    }
}

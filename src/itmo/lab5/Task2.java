package itmo.lab5;

import java.util.Collections;

public class Task2 {
    public static void main(String[] args) {
        String text = "Level";

        isPalindromeUsingStringBuilder(text);
    }

    public static void isPalindromeUsingStringBuilder(String text) {
        String clean = text.toLowerCase();
        StringBuilder plain = new StringBuilder(clean);
        StringBuilder reverse = plain.reverse();
        System.out.println("Слово " + text + " палиндром: " + reverse.toString().equals(clean));
    }
}

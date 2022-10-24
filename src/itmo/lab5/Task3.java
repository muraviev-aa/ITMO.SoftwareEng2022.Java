package itmo.lab5;

import java.util.Arrays;

public class Task3 {
    public static void main(String[] args) {

        String changeWord = "н";
        String text = "бяка не бяка а бяка";


        replaceAll(changeWord, text);
        examSubstring(changeWord, text);
        changeArray(changeWord, text);
    }

    public static void replaceAll(String changWord, String text) {

        System.out.println(text.replace(changWord, "[вырезано цензурой]"));

    }

    public static void examSubstring(String changeWord, String text) {

        boolean bl = text.contains(changeWord);
        System.out.println(bl);
    }

    public static void changeArray(String changeWord, String text) {
        String[] stringArray = text.toLowerCase().split(" ");

        for (String string : stringArray) {
            for (int i = 1; i < stringArray.length; i++) {
                boolean b = string.contains(changeWord);
                System.out.println(b);
            }


        }
    }
}

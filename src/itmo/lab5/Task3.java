package itmo.lab5;


import java.util.Objects;

public class Task3 {
    public static void main(String[] args) {

        String text = "Бяка за нами и перед нами бяка";
        String changeWord = "бяка";

        replaceWord(text, changeWord);
    }

    public static void replaceWord(String text, String changeWord) {
        String[] stringArray = text.toLowerCase().split(" ");

        for (int i = 0; i < stringArray.length; i++) {
            if (text.toLowerCase().contains(changeWord) && Objects.equals(stringArray[i], changeWord)) {
                System.out.println(text.toLowerCase().replace(changeWord, "[вырезано цензурой]"));

            } else {
                System.out.println("Замены не будет");
            }
        }
    }


}

package itmo.lab5;

public class Task3 {
    public static void main(String[] args) {

        String changWord = "бяка";
        String text = "За нами бяка и перед нами бяка, вокруг бяка. Но нам хорошо!";

        replaceAll(changWord, text);
        examSubstring(changWord, text);
    }

    public static void replaceAll(String changWord, String text) {

        System.out.println(text.replace(changWord, "[вырезано цензурой]"));

    }

    public static void examSubstring(String changWord, String text) {
        if (text.indexOf(changWord) == -1) {
            System.out.println("Заменяемое слово не является подстрокой!");
        }else {
            System.out.println("Заменяемое слово является подстрокой");
        }
    }
}

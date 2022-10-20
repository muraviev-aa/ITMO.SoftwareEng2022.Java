package itmo.lab5;

public class Task3 {
    public static void main(String[] args) {

        String text = "За нами бяка и перед нами бяка, вокруг бяка. Но нам хорошо!";

        replaceAll(text);
    }

    public static void replaceAll(String text) {

        System.out.println(text.replace("бяка", "[вырезано цензурой]"));

    }
}

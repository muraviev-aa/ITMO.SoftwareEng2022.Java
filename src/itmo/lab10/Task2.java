package itmo.lab10;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Task2 {

    public static void main(String[] args) {

        String text = "World peace";
        File file = new File("e:/ITMO/Java/text.txt");

        stringWriter(text, file);

    }

    public static void stringWriter(String text, File file) {
        try (BufferedWriter out = new BufferedWriter(new FileWriter(file))) {
            out.write(text);
        } catch (IOException e) {
            System.err.println(e.getMessage());
        }
    }
}

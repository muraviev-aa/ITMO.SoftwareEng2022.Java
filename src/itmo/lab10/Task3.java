package itmo.lab10;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Task3 {

    public static void main(String[] args) {

        File file = new File("e:/ITMO/Java/readme.txt");
        File file2 = new File("e:/ITMO/Java/text.txt");
        File file3 = new File("e:/ITMO/Java/append.txt");

        fileAppend(file, file2, file3);
    }

    public static void fileAppend(File file, File file2, File file3) {
        StringBuilder bld = new StringBuilder();

        try {
            Scanner scanner = new Scanner(file);
            Scanner scanner2 = new Scanner(file2);

            while (scanner.hasNext() || scanner2.hasNext()) {
                String string = (scanner.hasNext() ? scanner.next() : " ");
                String string2 = (scanner2.hasNext() ? scanner2.next() : " ");
                bld.append(string).append(" ");
                bld.append(string2).append(" ");
            }
            scanner.close();
            scanner2.close();

        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

        try (PrintWriter pw = new PrintWriter(file3)) {
            pw.write(bld.toString());
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}

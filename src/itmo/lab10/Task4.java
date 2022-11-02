package itmo.lab10;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Task4 {

    public static void main(String[] args) throws IOException {

        String doll = "\\$";

        File file = new File("e:/ITMO/Java/test.txt");
        List<String> list = new ArrayList<>();

        readerAddWriter(file, list, doll);
    }

    public static void readerAddWriter(File file, List<String> list, String doll) {
        try (BufferedReader bfr = new BufferedReader(new FileReader(file))) {
            String line;
            while ((line = bfr.readLine()) != null) {
                list.add(line.replaceAll("\\p{P}", doll));
//                System.out.println("Прочитано и заменено: " + list);
            }
        } catch (IOException e) {
            System.err.println(e.getMessage());
        }

        try (BufferedWriter bfw = new BufferedWriter(new FileWriter(file))) {
            for (String str : list) {
                bfw.write(str);
                bfw.newLine();
//                System.out.println("Записано измененное: " + list);
            }
        } catch (IOException e) {
            System.err.println(e.getMessage());
        }
    }
}

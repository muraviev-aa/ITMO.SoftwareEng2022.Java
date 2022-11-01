package itmo.lab10;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Task1 {

    public static void main(String[] args) {

        File file = new File("e:/ITMO/Java/readme.txt");
        List<String> arrayList = new ArrayList<>();

        addArrayList(arrayList, file);
        printArrayList(arrayList);

    }

    public static void addArrayList(List<String> arrayList, File file) {
        try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
            while(reader.ready()) {
                arrayList.add(reader.readLine());
            }
        }catch(IOException e) {
            System.out.println(e);
        }
    }

    public static void printArrayList(List<String> arrayList) {

        System.out.println(arrayList);
    }
}

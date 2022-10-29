package itmo.lab9;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Task1 {

    public static void main(String[] args) {

        List<String> strings = new ArrayList<>();
        strings.add("string1");
        strings.add("string1");
        strings.add("string2");
        strings.add("string3");
        strings.add("string4");
        strings.add("string5");
        strings.add("string5");
        strings.add("string6");
        strings.add("string7");
        strings.add("string7");

        methodPrintList(strings);

        Set<String> set = new HashSet<>(strings);
        strings.clear();
        strings.addAll(set);

        methodPrintSet(set);
    }

    public static void methodPrintList(List<String> strings) {
        System.out.println("Коллекция с дубликатами: " + strings);
    }

    public static void methodPrintSet(Set<String> set) {
        System.out.println("Коллекция без дубликатов: " + set);
    }

}


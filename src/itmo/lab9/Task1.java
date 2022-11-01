package itmo.lab9;

import java.util.*;

public class Task1 {

    public static void main(String[] args) {

        List<String> list = new ArrayList<>();
        list.add("string1");
        list.add("string1");
        list.add("string2");
        list.add("string3");
        list.add("string4");
        list.add("string5");
        list.add("string5");
        list.add("string6");
        list.add("string7");
        list.add("string7");

        delDublicates(list);
    }

    public static <T> void delDublicates(List<T> list) {

        Set<T> set = new LinkedHashSet<>(list);
        System.out.println("Коллекция без дубликатов1: " + set);
    }


}


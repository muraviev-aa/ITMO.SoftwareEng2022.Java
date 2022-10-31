package itmo.lab9;

import java.util.*;

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

        System.out.println("Коллекция без дубликатов: " + deleteDublicates(strings));

    }

    //Метод принимает коллекцию и возвращает коллекцию уже без дубликатов
    public static Set<String> deleteDublicates(List<String> strings) {

        return new LinkedHashSet<>(strings);
    }

}


package itmo.lab9;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Task3 {

    private static String name;

    public Task3(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static void main(String[] args) {

        Map<String, Integer> map = new HashMap<>();

        map.put("Petr", 100);
        map.put("Ivan", 93);
        map.put("Tom", 85);
        map.put("Jon", 58);

        gettingPoints(map);

    }

    public static void gettingPoints(Map<String, Integer> map) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите имя: ");
        name = scanner.nextLine();

        Task3 var = new Task3(name);

        Integer integer = map.get(var.getName());
        System.out.println("Количество очков: " + integer);
    }
}

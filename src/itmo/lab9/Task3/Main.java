package itmo.lab9.Task3;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        Map<User, Integer> map = new HashMap<>();

        map.put(new User("Ivan"), 4);
        map.put(new User("Petr"), 5);
        map.put(new User("Tom"), 3);
        map.put(new User("Mike"), 2);

        Scanner scanner = new Scanner(System.in);
        countBalls(map, scanner);
    }

    public static void countBalls(Map<User, Integer> map, Scanner scanner) {

        System.out.println("Введите имя: ");
        String name = scanner.nextLine();
        for (Map.Entry<User, Integer> part : map.entrySet()) {
            if (part.getKey().getName().equals(name)) {
                System.out.println("Количество очков: " + part.getValue());
            }
        }
    }
}

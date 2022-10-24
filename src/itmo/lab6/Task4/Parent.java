package itmo.lab6.Task4;

import java.util.Scanner;

public class Parent {

    protected Integer number;

    Scanner scanner = new Scanner(System.in);

    public void addInt() {
        System.out.println("Введите целое число: ");
        number = scanner.nextInt();
    }
}

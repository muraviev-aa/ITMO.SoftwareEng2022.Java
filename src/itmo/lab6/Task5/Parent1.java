package itmo.lab6.Task5;

import java.util.Scanner;

public class Parent1 {

    protected int age;

    public Parent1() {
    }

    public Parent1(int age) {
        this.age = age;
    }

    Scanner scanner = new Scanner(System.in);


    public void printInfo() {
        System.out.println("Введите возраст пользователя: ");
        age = scanner.nextInt();
    }
}

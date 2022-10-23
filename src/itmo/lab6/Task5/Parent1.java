package itmo.lab6.Task5;


import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNull;

import java.util.Scanner;

public class Parent1 {

    protected Integer age;
    protected String name;

    public Parent1(Integer age, String name) {
        this.age = age;
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void getName() {
        System.out.println("Родитель: " + age);
    }

    static Scanner scan = new Scanner(System.in);

    public static int scanInt() {

        return scan.nextInt();
    }

    public static String scanLine() {

        return scan.nextLine();
    }
}

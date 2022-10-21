package itmo.lab2;

import java.util.Scanner;

public class Task1 {
    public static void summa(int a, int b) {
        System.out.println("Результат суммы чисел типа int: " + (a + b));
    }

    public static void summa(double c, double d) {
        System.out.println("Результат суммы чисел типа double: " + (c + d));
    }

    public static void summa(long e, long f) {
        System.out.println("Результат суммы чисел типа long: " + (e + f));
    }

    public static void subtraction(int a, int b) {
        System.out.println("Результат вычитания чисел типа int: " + (a - b));
    }

    public static void subtraction(double c, double d) {
        System.out.println("Результат вычитания чисел типа double: " + (c - d));
    }

    public static void subtraction(long e, long f) {
        System.out.println("Результат вычитания чисел типа long: " + (e - f));
    }

    public static void division(int a, int b) {
        System.out.println("Результат деления чисел типа int: " + (double) a / b);
    }

    public static void division(double c, double d) {
        System.out.println("Результат деления чисел типа double: " + c / d);
    }

    public static void division(long e, long f) {
        System.out.println("Результат деления чисел типа long: " + (double)e / f);
    }

    public static void multiplication(int a, int b) {
        System.out.println("Результат умножения чисел типа int: " + a * b);
        System.out.println("---");
    }

    public static void multiplication(double c, double d) {
        System.out.println("Результат умножения чисел типа double: " + c * d);
        System.out.println("---");
    }
    public static void multiplication(long e, long f){
        System.out.println("Результат умножения чисел типа long: " + e * f);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите два числа в формате int: \n");
        int a = scanner.nextInt();
        int b = scanner.nextInt();

        System.out.print("Введите double числа: \n");
        double c = scanner.nextDouble();
        double d = scanner.nextDouble();

        System.out.print("Введите long числа: \n");
        long e = scanner.nextLong();
        long f = scanner.nextLong();
        System.out.println("\n");

        //Результ вычислений (числа типа int)
        summa(a, b);
        subtraction(a, b);
        division(a, b);
        multiplication(a, b);

        //Результ вычислений (числа типа double)
        summa(c, d);
        subtraction(c, d);
        division(c, d);
        multiplication(c, d);

        //Результ вычислений (числа типа long)
        summa(e, f);
        subtraction(e, f);
        division(e, f);
        multiplication(e, f);

    }
}

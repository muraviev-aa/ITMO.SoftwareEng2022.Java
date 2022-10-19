package itmo.lesson2;

import java.util.Scanner;

public class Lesson2_1 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите int числа: \n");
        int a = scanner.nextInt();
        int b = scanner.nextInt();

        System.out.print("Введите double числа: \n");
        double c = scanner.nextDouble();
        double d = scanner.nextDouble();

        System.out.print("Введите long числа: \n");
        long e = scanner.nextLong();
        long f = scanner.nextLong();
        System.out.println("\n");

        //Результат сложения чисел
        Summa.summa(a, b);
        Summa.summa(c, d);
        Summa.summa(e, f);
        System.out.println("\n");

        //Результат деления чисел
        Division.division(a, b);
        Division.division(c, d);
        Division.division(e, f);
        System.out.println("\n");

        //Результат умножения чисел
        Multiplication.multiplication(a, b);
        Multiplication.multiplication(c, d);
        Multiplication.multiplication(e, f);
        System.out.println("\n");

        //Результат вычитания чисел
        Subtraction.subtraction(a, b);
        Subtraction.subtraction(c, d);
        Subtraction.subtraction(e, f);
    }

}

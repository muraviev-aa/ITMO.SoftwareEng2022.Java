package itmo.lab4.Part1;

import java.util.Scanner;

public class Task4 {
    public static void returnTrue(int num1, int num2, int num3){
        if (num1 < num2 && num2 < num3) {
            System.out.println("Результат: true");
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите первое число: ");
        int num1 = scanner.nextInt();
        System.out.print("Введите второе число: ");
        int num2 = scanner.nextInt();
        System.out.print("Введите третье число: ");
        int num3 = scanner.nextInt();

        returnTrue(num1, num2, num3);
    }
}

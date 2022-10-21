package itmo.lab1;

import java.util.Scanner;

public class Task5 {
    public static void printResult(int num1, int num2, int num3){
        System.out.println("Первое число: " + num1 + "\n" + "Второе число: " + num2 + "\n" + "Третье число: " + num3);
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите числа: \n");
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        int num3 = scanner.nextInt();

        printResult(num1, num2, num3);
    }
}

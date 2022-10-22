package itmo.lab4.Part2;

import java.util.Arrays;
import java.util.Scanner;

public class Task2 {
    public static void printMethod(int[] ints) {
        System.out.println("Result: " + Arrays.toString(ints));
    }

    public static void main(String[] args) {
        int i;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter array length: :");
        int a = scanner.nextInt();
        int[] ints = new int[a];
        for (i = 1; i <= a; i++) {
            int h = i;
            System.out.println("Enter " + h++ + " array number:");
            int num = scanner.nextInt();
            ints[i - 1] = num;
        }

        printMethod(ints);
    }
}

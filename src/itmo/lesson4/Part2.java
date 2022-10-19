package itmo.lesson4;

import java.util.Arrays;
import java.util.Scanner;

public class Part2 {

    public static void main(String[] args) {


        System.out.println("----------------------");
        System.out.println("2 часть. 1 упражнение\n");

        int[] array = {1, 3, 4};
        if(array[0] < array[1] && array[1] < array[2]){
            System.out.println("OK");
        }else{
            System.out.println("Please, try again");
        }


//        System.out.println("----------------------");
//        System.out.println("2 часть. 2 упражнение\n");
//
//        int i;
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Enter array length: :");
//        int a = scanner.nextInt();
//        int[] ints = new int[a];
//        for (i = 1; i <= a; i++) {
//            int h = i;
//            System.out.println("Enter " + h++ + " array number:");
//            int num = scanner.nextInt();
//            ints[i-1] = num;
//        }
//        System.out.println("Result: " + Arrays.toString(ints));


//        System.out.println("----------------------");
//        System.out.println("2 часть. 3 упражнение\n");
//
//
//        int[] numbers = {1, 2 , 3, 4, 5};
//        System.out.println("Array 1: " + Arrays.toString(numbers));
//        int last = numbers[numbers.length - 1];
//        int first = numbers[numbers.length - 5];
//        for(int i = numbers.length - 1; i > 3; --i){
//            numbers[i] = numbers[i-1];
//        }
//        numbers[0] = last;
//        numbers[4] = first;
//        System.out.println("Array 2: " + Arrays.toString(numbers));


//        System.out.println("----------------------");
//        System.out.println("2 часть. 4 упражнение\n");
//
//        int[] mas = {1, 4, 2, 3, 1, 2, 5, 10};
//        System.out.println("Old array: " + Arrays.toString(mas));
//        boolean isSorted = false;
//        int buf;
//        while (!isSorted) {
//            isSorted = true;
//            for (int i = 0; i < mas.length - 1; i++) {
//                if (mas[i] > mas[i + 1]) {
//                    isSorted = false;
//                    buf = mas[i];
//                    mas[i] = mas[i + 1];
//                    mas[i + 1] = buf;
//                }
//            }
//        }
//        System.out.println("New array: " + Arrays.toString(mas));
//
//        int un;
//        for(int i = 0; i < mas.length - 1; i++){
//            if(mas[i] == mas[i + 1] && mas[i + 1] < mas[i + 2] && mas[i + 2] < mas[i + 3]){
//                un = mas[i + 2];
//                System.out.println("First unique number: " + un);
//            }
//        }

    }
}



package itmo.lesson1;

import java.util.Scanner;

public class LessonFirst {

    public static void main(String[] args){

        //1 упражнение:
        System.out.println("Я\nхорошо\nзнаю\nJava.");



        //2 упражнение:
        float a = (46+10)*(10/3f);
        System.out.println(a);

        int b = 29*4*(-15);
        System.out.println(b);



        //3 упражнение:
        int number = 10500;
        int result = (number/10)/10;
        System.out.println(result);



        //4 упражнение:
        System.out.println(3.6f*4.1f*5.9f);



        //5 упражнение:
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите числа: \n");
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        int num3 = scanner.nextInt();
        System.out.println("Первое число: " + num1 + "\n" + "Второе число: " + num2 + "\n" + "Третье число: " + num3);


        //6 упражнение:
        Scanner scanner1 = new Scanner(System.in);
        System.out.print("Введите целое число: ");
        int num = scanner1.nextInt();

        if(num%2 != 0) {
            System.out.printf("Нечетное");
        } else if(num%2 ==0 && num > 100) {
            System.out.printf("Выход за пределы диапазона");
        } else {
            System.out.printf("Четное");
        }
        scanner1.close();
    }
}

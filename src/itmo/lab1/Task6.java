package itmo.lab1;

import java.util.Scanner;

public class Task6 {
    public static void checkParity(int num){

        if(num > 100){
            System.out.printf("Выход за пределы диапазона");
        }else if(num%2 != 0){
            System.out.printf("Число нечетное");
        }else{
            System.out.printf("Число четное");
        }
    }
    public static void main(String[] args) {
        Scanner scanner1 = new Scanner(System.in);
        System.out.print("Введите целое число: ");
        int num = scanner1.nextInt();

        checkParity(num);
    }
}

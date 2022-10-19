package itmo.lesson2;

import java.util.Scanner;

public class Lesson2_2 {

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите ширину основания треугольника: \n");
        double a = scanner.nextDouble();
        System.out.print("Введите высоту треугольника: \n");
        double h = scanner.nextDouble();

        //конструктор с параметрами (ширина и высота треугольника)
        Triangle t1 = new Triangle(a, h);

        //конструктор по умолчанию
        Lesson2_2  lesson2 = new Lesson2_2();

        System.out.println("Площадь треугольника: " + t1.area());
        System.out.println("Результат работы конструктора по умолчанию: " + lesson2);

    }
}

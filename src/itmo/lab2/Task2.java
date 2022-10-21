package itmo.lab2;

import java.util.Scanner;

public class Task2 {
    double w; //ширина основания треугольника
    double h; //высота треугольника

    public Task2(double w, double h){
        this.w = w;
        this.h = h;
    }
    public static void area(double w, double h){
        System.out.println("Площадь треугольника: "+ (w * h / 2));
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите ширину основания треугольника: \n");
        double w = scanner.nextDouble();
        System.out.print("Введите высоту треугольника: \n");
        double h = scanner.nextDouble();

        //площадь треугольника
        area(w, h);
    }
}

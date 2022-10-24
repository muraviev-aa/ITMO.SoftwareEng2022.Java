package itmo.lab6.Task3;

import java.util.Scanner;

public class Truck extends Car {

    private int wheels; //количество колес
    private double maxweight; //максимальный вес груза


    public Truck(int weight, String model, char color, float speed, int wheels, double maxweight) {
        super(weight, model, color, speed);
        this.wheels = wheels;
        this.maxweight = maxweight;
    }

    Scanner scanner = new Scanner(System.in);

    public void newWheels() {
        System.out.println("Введите новое количество колес: ");
        wheels = scanner.nextInt();
        System.out.println("Новое количество колес - " + wheels);
    }

    @Override
    public void outPut() {
        super.outPut();
        System.out.println("Количество колес - " + wheels + " и максимальный вес перевозимого груза - " + maxweight);
    }
}

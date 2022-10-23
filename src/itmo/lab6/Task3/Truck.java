package itmo.lab6.Task3;

public class Truck extends Car {

    private int wheels;
    private double maxweight;


    public Truck(int weight, String model, char color, float speed, int wheels, double maxweight) {
        super(weight, model, color, speed);
        this.wheels = wheels;
        this.maxweight = maxweight;
    }

    public void newWheels(int x) {
        wheels = x;
        System.out.println(wheels);
    }
}

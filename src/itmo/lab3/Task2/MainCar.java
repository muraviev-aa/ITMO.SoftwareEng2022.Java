package itmo.lab3.Task2;


public class MainCar {
    public static void main(String[] args) {

        Car car = new Car(Color.BLACK);
        car.methodPrintAll();

        Car car1 = new Car(Color.RED, 200.5);
        car1.methodPrintAll();

        Car car2 = new Car();
        car2.methodPrintAll();

    }
}

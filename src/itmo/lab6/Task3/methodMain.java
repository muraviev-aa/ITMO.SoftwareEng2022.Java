package itmo.lab6.Task3;

public class methodMain {

    public static void main(String[] args) {

        Car car = new Car(100, "Zapor", 'S', 60.2f);
        car.outPut();
        System.out.println("--------------");
        Truck truck = new Truck(200, "Uaz", 'A', 80.3f,4, 100);
        truck.outPut();
        System.out.println("--------------");
        truck.newWheels();
        truck.outPut();

    }
}

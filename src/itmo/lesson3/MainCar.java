package itmo.lesson3;

public class MainCar {

    public static void main(String[] args) {

        Car car = new Car(Color.RED, 100.5);
        car.setName("MAZ");
        System.out.println(car);
        System.out.println("-------------------------------------------");

        Car car1 = new Car();
        car1.setColor(Color.BLACK);
        car1.setName("KAMAZ");
        car1.setWeight(200.4);
        System.out.println(car1);
        System.out.println("-------------------------------------------");

        Car car2 = new Car(Color.WHITE);
        car2.setName("KRAZ");
        car2.setWeight(300.2);
        System.out.println(car2);

    }
}

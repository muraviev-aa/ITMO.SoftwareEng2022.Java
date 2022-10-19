package itmo.lesson3;

public class MainHouse {
    public static void main(String[] args) {

        //первый объект
        House house = new House();
        house.setDetails(4, 2000, "GoodHouse");
        System.out.println("-------------------------------------------");
        System.out.println(house);
        System.out.println("Возраст дома: " + house.ageHouse() + " года.");
        System.out.println("-------------------------------------------");

        //второй объект
        House house1 = new House();
        house1.setDetails(9, 1979, "PiterHouse");
        System.out.println(house1);
        System.out.println("Возраст дома: " + house1.ageHouse() + " года.");
        System.out.println("-------------------------------------------");

        //работа метода для установки значений
        System.out.println(House.getDetails());
        System.out.println("-------------------------------------------");
    }
}

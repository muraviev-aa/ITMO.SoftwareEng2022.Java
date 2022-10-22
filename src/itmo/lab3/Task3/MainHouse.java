package itmo.lab3.Task3;

public class MainHouse {
    public static void main(String[] args) {
        House house = new House();
        house.setHouse(5, 2022,1970, "Chrushevka");
        house.methodPrintHouse();
        house.getAgeHouse();

        House house1 = new House();
        house1.setHouse(9, 2022, 2000,"BigHouse");
        house1.methodPrintHouse();
        house1.getAgeHouse();
    }
}

package itmo.lab4.Part1;

public class Task2 {
    public static void divisionOutput() {
        for (int i = 1; i <= 100; i++) {
            if (i % 3 == 0) {
                System.out.println("Делится на 3: " + i);
            }
        }
        System.out.println("-----");

        for (int i = 1; i <= 100; i++) {
            if (i % 5 == 0) {
                System.out.println("Делится на 5: " + i);
            }
        }
        System.out.println("-----");

        for (int i = 1; i <= 100; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println("Делится на 3 и 5: " + i);
            }
        }
    }

    public static void main(String[] args) {

        divisionOutput();
    }
}

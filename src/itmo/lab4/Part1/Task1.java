package itmo.lab4.Part1;

public class Task1 {
    public static void oddNumbers() {
        System.out.println("Нечетные числа от 1 до 99:");
        for (int i = 1; i <= 99; i++) {
            if (i % 2 != 0) {
                System.out.println(i);
            }
        }
    }

    public static void main(String[] args) {

        oddNumbers();
    }
}

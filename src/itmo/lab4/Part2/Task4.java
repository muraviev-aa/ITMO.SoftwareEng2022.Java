package itmo.lab4.Part2;

import java.util.Arrays;

public class Task4 {
    public static void firstUniqueNumber(int[] mas) {
        System.out.println("Old array: " + Arrays.toString(mas));
        boolean isSorted = false;
        int buf;
        while (!isSorted) {
            isSorted = true;
            for (int i = 0; i < mas.length - 1; i++) {
                if (mas[i] > mas[i + 1]) {
                    isSorted = false;
                    buf = mas[i];
                    mas[i] = mas[i + 1];
                    mas[i + 1] = buf;
                }
            }
        }
        System.out.println("New array: " + Arrays.toString(mas));

        int un;
        for (int i = 0; i < mas.length - 1; i++) {
            if (mas[i] == mas[i + 1] && mas[i + 1] < mas[i + 2] && mas[i + 2] < mas[i + 3]) {
                un = mas[i + 2];
                System.out.println("First unique number: " + un);
            }
        }
    }

    public static void main(String[] args) {

        int[] mas = {1, 4, 2, 3, 1, 2, 5, 10};

        firstUniqueNumber(mas);
    }
}

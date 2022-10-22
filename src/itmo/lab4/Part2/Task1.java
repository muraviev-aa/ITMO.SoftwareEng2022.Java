package itmo.lab4.Part2;

import org.jetbrains.annotations.NotNull;

public class Task1 {
    public static void arrSort(int @NotNull [] array) {
        if (array[0] < array[1] && array[1] < array[2]) {
            System.out.println("OK");
        } else {
            System.out.println("Please, try again");
        }
    }

    public static void main(String[] args) {
        int[] array = {1, 3, 4};

        arrSort(array);
    }
}

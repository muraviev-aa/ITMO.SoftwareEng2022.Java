package itmo.lab4.Part1;

import org.jetbrains.annotations.NotNull;

public class Task6 {
    public static void arrCheck(int @NotNull [] array){
        if(array[0] == 1 || array[1] == 1 || array[2] == 1){
            System.out.println("Массив содержит число 1.");
        }
        if(array[0] == 3 || array[1] == 3 || array[2] == 3){
            System.out.println("Массив содержит число 3.");
        }
    }
    public static void main(String[] args) {
        int[] array = {4, 3, 1};

        arrCheck(array);
    }
}

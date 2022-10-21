package itmo.lab4.Part1;

import org.jetbrains.annotations.NotNull;

public class Task5 {
    public static void arrTrue(int @NotNull [] array){
        if(array[0] == 3 && array[2] == 3){
            System.out.println("array = " + array[0] +", "+ array[1] +", "+ array[2]);
            System.out.println("true");
        }
    }
    public static void main(String[] args) {
        int[] array = {3, 2, 3};

        arrTrue(array);
    }
}

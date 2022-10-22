package itmo.lab4.Part2;

import java.util.Arrays;

public class Task3 {
    public static void methodSwaps(int[] numbers){
        System.out.println("Array 1: " + Arrays.toString(numbers));
        int last = numbers[numbers.length - 1];
        int first = numbers[numbers.length - 5];
        for(int i = numbers.length - 1; i > 3; --i){
            numbers[i] = numbers[i-1];
        }
        numbers[0] = last;
        numbers[4] = first;

        System.out.println("Array 2: " + Arrays.toString(numbers));
    }
    public static void main(String[] args) {
        int[] numbers = {1, 2 , 3, 4, 5};

        methodSwaps(numbers);
    }
}

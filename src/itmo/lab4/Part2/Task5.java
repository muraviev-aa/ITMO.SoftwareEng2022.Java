package itmo.lab4.Part2;

import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNull;

import java.util.Arrays;

public class Task5 {
    public static void main(String[] args) {

        int[] ints = {4, 31, 3, 64, 55, 1005, 96, 87, 21, 33, 75};

        int[] result = mergeSort(ints);

        methodPrint(ints, result);
    }

    public static int @NotNull [] mergeSort(int @NotNull [] ints) {
//        System.out.println("Intermediate array operations: " + Arrays.toString(ints));
        if (ints.length < 2) {
            return ints;
        }

        int mid = ints.length / 2;
        int[] left = new int[mid];
        int[] right;

        if (ints.length % 2 == 0) {
            right = new int[mid];
        } else {
            right = new int[mid + 1];
        }

        for (int i = 0; i < left.length; i++) {
            left[i] = ints[i];
        }

        for (int j = 0; j < right.length; j++) {
            right[j] = ints[mid + j];
        }

        left = mergeSort(left);
        right = mergeSort(right);

        return mergeParts(left, right);
    }

    @Contract(pure = true)
    private static int @NotNull [] mergeParts(int @NotNull [] left, int @NotNull [] right) {
        int[] result = new int[left.length + right.length];

        int leftPointer = 0;
        int rightPointer = 0;
        int resultPointer = 0;

        while (leftPointer < left.length || rightPointer < right.length) {
            if (leftPointer < left.length && rightPointer < right.length) {
                if (left[leftPointer] < right[rightPointer]) {
                    result[resultPointer++] = left[leftPointer++];
                } else {
                    result[resultPointer++] = right[rightPointer++];
                }
            } else if (leftPointer < left.length) {
                result[resultPointer++] = left[leftPointer++];

            } else if (rightPointer < right.length) {
                result[resultPointer++] = right[rightPointer++];
            }

        }

        return result;
    }

    public static void methodPrint(int[] ints, int[] result) {

        System.out.println("Old array" + Arrays.toString(ints));
        System.out.println("New array: " + Arrays.toString(result));
    }
}

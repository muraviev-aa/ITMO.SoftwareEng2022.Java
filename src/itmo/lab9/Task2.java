package itmo.lab9;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Random;

public class Task2 {

    public static void main(String[] args) throws InterruptedException {

        ArrayList<String> strings = new ArrayList<>();
        LinkedList<String> strings1 = new LinkedList<>();

        currentTimeMillisArrayList(strings);    // Result мс: 1046
        currentTimeMillisLinkedList(strings1);  // Result мс: 56250

    }

    public static void currentTimeMillisArrayList(ArrayList<String> strings) throws InterruptedException {

        long start = System.currentTimeMillis();

        //логика по ArrayList
        methodAddArrayList(strings);
        methodGetArrayList(strings);

        Thread.sleep(1000);

        long finish = System.currentTimeMillis();
        long elapsed = finish - start;
        System.out.println("ArrayList прошло времени, мс: " + elapsed);

    }
    public static void currentTimeMillisLinkedList(LinkedList<String> strings1) throws InterruptedException {

        long start1 = System.currentTimeMillis();

        //логика по LinkedList
        methodAddLinkedList(strings1);
        methodGetLinkedList(strings1);

        Thread.sleep(1000);

        long finish1 = System.currentTimeMillis();
        long elapsed1 = finish1 - start1;
        System.out.println("LinkedList прошло времени, мс: " + elapsed1);

    }

    public static void methodAddArrayList(ArrayList<String> strings) {
        for (int i = 0; i < 1000000; i++) {

            strings.add("qva");
        }
    }

    public static void methodAddLinkedList(LinkedList<String> strings1) {
        for (int i = 0; i < 1000000; i++) {

            strings1.add("qva");
        }
    }

    public static void methodGetArrayList(ArrayList<String> strings) {
        Random rand = new Random();
        for (int i = 0; i <= 100000; i++) {

            strings.get(rand.nextInt(strings.size()));
        }
    }

    public static void methodGetLinkedList(LinkedList<String> strings1) {
        Random rand = new Random();
        for (int i = 0; i <= 100000; i++) {

            strings1.get(rand.nextInt(strings1.size()));
        }
    }
}



package itmo.labMultithreading.Task1;

import static java.lang.Thread.yield;

public class MyThread extends Thread {

    private String name;

    public MyThread(String name) {
        this.name = name;
    }

    public void run() {
        for (int i = 1; i <= 100; i++) {
            System.out.println(name + ": " + i);
            yield();
        }
    }
}

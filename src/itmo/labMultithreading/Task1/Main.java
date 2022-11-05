package itmo.labMultithreading.Task1;

public class Main {

    public static void main(String[] args) {

        for (int i = 1; i <= 10; i++) {
            Thread[] threads = {
                    new MyThread("Thread " + i)
            };
            for (Thread t : threads) {
                t.start();
            }
        }
    }
}


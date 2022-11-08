package itmo.labMultithreading.Task3;

public class Main {

    public static void main(String[] args) throws InterruptedException {

        Counter counter = new Counter();

        Thread[] threads = new Thread[100];

        resultCount(threads, counter);

    }

    static void resultCount(Thread[] threads, Counter counter) {
        Runnable run = () -> {
            synchronized (counter) {
                for (int i = 0; i < 1000; i++) {
                    counter.increment();
                    System.out.println(counter.getCount());
                }
            }
        };

        for (int i = 0; i < threads.length; i++) {
            threads[i] = new Thread(run);
        }

        for (Thread thr : threads) {
            thr.start();
        }
    }
}

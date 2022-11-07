package itmo.labMultithreading.Task3;

public class Main {

    public static void main(String[] args) throws InterruptedException {

        Counter counter = new Counter();

        Thread[] threads = new Thread[100];


        Runnable run = () -> {
            for (int i = 0; i <= 1000; i++) {
                counter.increment();
            }
        };

        for (int i = 0; i < threads.length; i++) {
            threads[i] = new Thread(run);
        }


        for (Thread thr : threads) {
            thr.start();
        }


        while (!endThreads(threads)) {
            Thread.sleep(100);
        }

        System.out.println(counter.getCount());
    }

    static boolean endThreads(Thread[] threads) {
        for (Thread thr : threads) {
            if (thr.isAlive()) {
                return false;
            }
        }
        return true;
    }
}

package itmo.labMultithreading.Task4;

public class MyThread extends Thread {

    private final int threadNum;
    private int curThreadNum;
    private int numThreads;

    final Object obj = new Object();

    public MyThread() {
        threadNum = numThreads++;
    }

    @Override
    public void run() {
        while (true) {
            synchronized (obj) {
                while (curThreadNum != threadNum) {
                    try {
                        obj.wait();
                    } catch (InterruptedException e) {
                        System.out.println(e.getMessage());
                    }
                }
                System.out.println(Thread.currentThread().getName());
//                curThreadNum = threadNum == numThreads - 1 ? 0 : threadNum + 1;
                obj.notify();
            }
        }
    }
}

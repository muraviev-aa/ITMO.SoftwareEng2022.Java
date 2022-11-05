package itmo.labMultithreading.Task2;

public class MyThread implements Runnable {

    Thread t;

    public MyThread(String threadName) {
        t = new Thread(this, threadName);
        Thread.State ts = t.getState();
        System.out.println("MyThread in constructor (before launch): " + StateProcess.State(ts));
        t.start();
    }

    @Override
    public void run() {
        Thread.State ts = t.getState();
        System.out.println("MyThread in method run() (after launch): " + StateProcess.State(ts));
    }
}

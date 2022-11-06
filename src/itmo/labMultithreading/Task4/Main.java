package itmo.labMultithreading.Task4;

public class Main {

    public static void main(String[] args) throws InterruptedException {

        Object obj = new Object();

        waitNotify(obj);
    }

    public static void waitNotify(Object obj) throws InterruptedException {

        for (int i = 0; i <= 3; i++) {
            new Thread(() -> {
                synchronized (obj) {
                    try {
                        System.out.println(Thread.currentThread().getName() + " запускаем wait()");
                        obj.wait();
                    } catch (InterruptedException e) {
                        e.getMessage();
                    }
                    System.out.println(Thread.currentThread().getName() + " после notify() работаем дальше");
                }
            }).start();

            Thread.sleep(3000);

            new Thread(() -> {
                synchronized (obj) {
                    System.out.println(Thread.currentThread().getName() + " запускаем notify()");
                    obj.notify();
                    System.out.println(Thread.currentThread().getName() + " notify() ");
                }
            }).start();
        }
    }
}

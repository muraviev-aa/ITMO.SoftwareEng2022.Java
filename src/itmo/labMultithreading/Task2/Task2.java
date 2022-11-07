package itmo.labMultithreading.Task2;

public class Task2 implements Runnable {


    public static void main(String[] args) throws InterruptedException {

        Task2 obj = new Task2();
        Thread thread = new Thread(obj);

        System.out.println("Состояние потока: " + thread.getState());

        thread.start();
        System.out.println("Состояние потока: " + thread.getState());

        thread.join(100);
        System.out.println("Состояние потока: " + thread.getState());

        thread.run();
        System.out.println("Состояние потока: " + thread.getState());

    }

    @Override
    public void run() {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.getMessage();
        }
    }
}

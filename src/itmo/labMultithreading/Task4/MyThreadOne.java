package itmo.labMultithreading.Task4;

public class MyThreadOne extends Thread {
    public MyThreadOne(Change change) {
    }

    @Override
    public void run() {

        System.out.println("Поток MyThreadOne");
    }
}

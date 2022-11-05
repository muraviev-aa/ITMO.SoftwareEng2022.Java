package itmo.labMultithreading.Task4;

public class MyThreadTwo extends Thread{

    public MyThreadTwo(Change change) {
    }

    @Override
    public void run() {

        System.out.println("Поток MyThreadTwo");
    }
}

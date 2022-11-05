package itmo.labMultithreading.Task4;

public class Main {

    public static void main(String[] args) {

        MyThread threadOne = new MyThread();
        MyThread threadTwo = new MyThread();
        threadOne.start();
        threadTwo.start();
    }
}

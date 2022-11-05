package itmo.labMultithreading.Task2;

public class MainThread {

    public static void main(String[] args) {

        MyThread mt = new MyThread("mt");

        try{
            mt.t.join();
            System.out.println("MyThread after method join() (at runtime): " + StateProcess.State(mt.t.getState()));
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        Thread tr = new Thread();

        try {
            Thread.sleep(3000);
            System.out.println("MainThread after sleep(): " + StateProcess.State(tr.getState()));
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

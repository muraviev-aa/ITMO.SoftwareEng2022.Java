package itmo.labMultithreading.Task4;

public class Change {

    boolean valueSet = false;

    public synchronized void get() {
        while (!valueSet) {
            try {
                wait();
            } catch (InterruptedException e) {
                System.out.println(e.getMessage());
            }
        }
        notify();
    }
}

package itmo.labMultithreading.Task4;

public class Main {

    public static void main(String[] args) {

        Change change = new Change();

        for(int i = 0; i < 10; i++) {
            MyThreadOne threadOne = new MyThreadOne(change);
            MyThreadTwo threadTwo = new MyThreadTwo(change);
            threadOne.start();
            threadTwo.start();
        }


    }
}

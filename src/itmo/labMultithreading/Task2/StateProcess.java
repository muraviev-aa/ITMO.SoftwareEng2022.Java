package itmo.labMultithreading.Task2;

public class StateProcess {

    public static String State(Thread.State ts) {

        if (ts == Thread.State.NEW)
            return "NEW";
        if (ts == Thread.State.RUNNABLE)
            return "RUNNABLE";
        return "WAITING";
    }
}

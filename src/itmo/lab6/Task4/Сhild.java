package itmo.lab6.Task4;

public class Сhild extends Parent {

    public Сhild(Integer number) {
        super(number);
    }

    public void methodOutput() {

        System.out.println("Переменная с главного класса: " + super.number);
    }
}

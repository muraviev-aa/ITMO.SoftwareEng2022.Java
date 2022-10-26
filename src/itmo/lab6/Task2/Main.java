package itmo.lab6.Task2;

public class Main {

    public static void main(String[] args) {

        Client client = new Client("Иван", "Васильевич", "Супербанк");
        client.methodOut();

        BankEmployee bankEmployee = new BankEmployee("Сергей", "Мавроди", "MMM");
        bankEmployee.methodOut();

    }
}

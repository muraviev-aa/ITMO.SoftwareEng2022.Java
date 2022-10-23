package itmo.lab6.Task5;

public class Child1 extends Parent1 {

    String name;

    public Child1(){}


    @Override
    public void addName() {

        System.out.println("Введите имя пользователя: ");
        scanner.nextLine();
        name = scanner.nextLine();
    }

    public void methodPrint() {

        System.out.println("Возраст пользователя: " + super.age + ";\n" + "Имя пользователя: " + name);
    }
}

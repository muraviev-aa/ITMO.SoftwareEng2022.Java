package itmo.lab6.Task5;

public class Child1 extends Parent1 {

    String name;

    public Child1() {

    }


    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println("Введите имя пользователя: ");
        scanner.nextLine();
        name = scanner.nextLine();
        System.out.println("Возраст пользователя: " + super.age + ";\n" + "Имя пользователя: " + name);
    }
}

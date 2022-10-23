package itmo.lab6.Task5;



import static itmo.lab6.Task5.Parent1.scanInt;
import static itmo.lab6.Task5.Parent1.scanLine;


public class Main1 {

    public static void main(String[] args) {


        System.out.print("Введите возраст пользователя: ");
        int age = scanInt();
        System.out.print("Введите имя пользователя: ");
        String name = scanLine();

        Parent1 parent = new Child1(age, name);
        parent.getAge();
        parent.getName();
        

    }
}

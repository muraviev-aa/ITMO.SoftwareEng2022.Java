package itmo.lab6.Task5;


public class Child1 extends Parent1 {


    public Child1(Integer age, String name) {
        super(age, name);
    }

    @Override
    public void getName() {

        System.out.println("Ребенок: " + super.name);
    }
}

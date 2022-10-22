package itmo.lab3.Task4;

public class Tree {
    private Integer age;
    private String name;
    private Boolean isLive;

    public Tree(Integer age, String name) {
        this.age = age;
        this.name = name;
    }

    public Tree(Integer age, String name, Boolean isLive) {
        this.age = age;
        this.name = name;
        this.isLive = isLive;
    }

    public Tree() {
        System.out.println("Пустой конструктор без параметров сработал");
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Boolean getLive() {
        return isLive;
    }

    public void setLive(Boolean live) {
        isLive = live;
    }

    public void methodPrint() {
        System.out.println("Tree{" +
                "age=" + age +
                ", name='" + name + '\'' +
                ", isLive=" + isLive +
                '}');
    }

}

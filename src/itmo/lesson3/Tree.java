package itmo.lesson3;

public class Tree {

    private Integer age;
    private String name;
    private Boolean isLive;

    public Tree(){
        System.out.println("Пустой конструктор без параметров сработал.");
    }

    public Tree(Integer age, String name){
        this.age = age;
        this.name = name;
    }

    public Tree(Integer age, String name, Boolean isLive){
        this.age = age;
        this.name = name;
        this.isLive = isLive;
    }

    public String toString(){

        return "Tree{" + "age=" + age + ", name=" + name + ", isLive=" + isLive + '}';
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

    public Boolean getIsLive() {
        return isLive;
    }

    public void setIsLive(Boolean isLive) {
        this.isLive = isLive;
    }
}

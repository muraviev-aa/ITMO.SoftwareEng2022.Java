package itmo.lab3.Task2;


public class Car {
    private Color color;
    private String name;
    private Double weight;

    public Car() {

    }

    public Car(Color color) {

        this.color = color;
    }

    public Car(Color color, Double weight) {
        this.color = color;
        this.weight = weight;
    }

    public Color getColor() {

        return color;
    }

    public void setColor(Color color) {

        this.color = color;
    }

    public String getName() {

        return name;
    }

    public void setName(String name) {

        this.name = name;
    }

    public Double getWeight() {

        return weight;
    }

    public void setWeight(Double weight) {

        this.weight = weight;
    }

    public void methodPrintAll() {
        System.out.println("Car{" +
                "color=" + color +
                ", name='" + name + '\'' +
                ", weight=" + weight +
                '}');
    }

}

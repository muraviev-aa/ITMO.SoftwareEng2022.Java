package itmo.lab1;

public class Task2 {
    public static void printResult(float a, int b){
        System.out.println("Результат вычисления: " + a);
        System.out.println("Результат вычисления: " + b);
    }
    public static void main(String[] args) {
        float a = (46+10)*(10/3f);
        int b = 29*4*(-15);

        printResult(a, b);
    }
}

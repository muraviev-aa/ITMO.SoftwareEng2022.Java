package itmo.lab1;

public class Task3 {
    public static void printResult(double result){
        System.out.println("Результат вычисления: " + result);
    }

    public static void main(String[] args) {
        int number = 10500;
        double result = (number / 10d) / 10;

        printResult(result);
    }
}

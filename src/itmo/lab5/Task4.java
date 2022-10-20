package itmo.lab5;

public class Task4 {
    public static void main(String[] args) {

        String string = "Eeeeeeeeee";
        String substring = "ee";

        subStringe(string, substring);

    }

    public static void subStringe(String string, String substring) {
        int index = 0, count = 0;
        while (true) {
            index = string.toLowerCase().indexOf(substring, index);
            if (index != -1) {
                count++;
                index = index + substring.length();
            } else {
                break;
            }
        }
        System.out.println("Количество подстрок в строке: " + count);
    }
}

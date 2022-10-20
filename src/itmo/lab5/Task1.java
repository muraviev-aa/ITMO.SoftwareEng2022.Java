package itmo.lab5;

public class Task1 {
    public static void main(String[] args) {

        String text = "Leaves are falling from the trees";

        longestWord(text);
    }

    public static void longestWord(String text) {
        String[] parts = text.split("\\s");
        String max = "";
        for (String part : parts) {
            if (part.length() > max.length()) {
                max = part;
            }
        }
        System.out.println(max);
    }
}







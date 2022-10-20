package itmo.lab5;

public class Task1 {
    public static void main(String[] args) {

        String text = "Deadline for the first task";

        System.out.println(longestWord(text));
    }

    public static String longestWord(String text) {
        String[] parts = text.split("\\s");
        String max = "";
        for (String part : parts) {
            if (part.length() > max.length()) {
                max = part;
            }
        }
        return max;
    }
}







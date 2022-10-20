package itmo.lab5;

public class Task5 {
    public static void main(String[] args) {

        String string = "This is a test string";

        strBuilder(string);

    }

    public static void strBuilder(String string){
        String[] words = new StringBuilder(string).reverse().toString().split(" ");
        StringBuilder strb = new StringBuilder();
        for (int i = words.length - 1; i >= 0; i--){
            strb.append(words[i]).append(" ");
        }
        System.out.println(strb);
    }
}

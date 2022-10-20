package itmo.lab5;

public class Task2 {
    public static void main(String[] args) {
        String text = "Level";
        char[] array = text.toLowerCase().toCharArray();

        examPalindrom(array);
    }
    public static void examPalindrom(char[] array){
        int l = array.length; //длина массива
        if(array[0] != array[l-1]){
            System.out.println("This word is not a palyndrom");
        }else{
            System.out.println("This word is palyndrom");
        }
    }
}

package itmo.lesson3;

public class MainTree {
    public static void main(String[] args) {
        System.out.println("----------------------------");
        Tree tree = new Tree();
        System.out.println("----------------------------");

        Tree tree1 = new Tree(100, "Pine");
        System.out.println(tree1);
        System.out.println("----------------------------");

        Tree tree2 = new Tree(50, "Maple", true);
        System.out.println(tree2);
        System.out.println("----------------------------");
    }
}

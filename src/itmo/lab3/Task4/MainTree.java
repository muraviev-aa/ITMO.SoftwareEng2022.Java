package itmo.lab3.Task4;


public class MainTree {
    public static void main(String[] args) {
        Tree tree = new Tree();

        Tree tree1 = new Tree(100, "Pine");
        tree1.methodPrint();

        Tree tree2 = new Tree(50, "Maple", true);
        tree2.methodPrint();
    }
}

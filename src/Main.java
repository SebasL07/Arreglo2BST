import java.util.*;
public class Main {

    private static Scanner sc = new Scanner(System.in);


    public static void main(String[] args) {

        String names = sc.nextLine();

        String[] arrayNames = names.split(" ");

        BST tree = new BST();

        tree.addNode(arrayNames,0,arrayNames.length-1);
        tree.print();
        System.out.println(tree.deep());

    }
}
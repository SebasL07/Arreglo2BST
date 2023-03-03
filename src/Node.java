public class Node {
    private Node left;

    private Node right;

    private String name;

    public Node(String value) {
        this.name = value;
    }

    public Node getLeft() {
        return left;
    }

    public void setLeft(Node left) {
        this.left = left;
    }

    public Node getRight() {
        return right;
    }

    public void setRight(Node right) {
        this.right = right;
    }

    public String getValue() {
        return name;
    }

    public void setValue(String value) {
        this.name = value;
    }
}

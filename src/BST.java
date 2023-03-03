public class BST {

    private Node root;

    public Node addNode(String[] n, int left, int right){

        int mid = (left + right)/2;

        if(root == null){
            root = new Node(n[mid]);
        }
        Node node = new Node(n[mid]);
        if (node !=null && right-left <= 2) {
            if(left == mid){
                node.setRight(new Node(n[right]));
            } else if (right == mid) {
                node.setLeft(new Node(n[left]));
            }else{
                node.setLeft(new Node(n[left]));
                node.setRight(new Node(n[right]));
            }

            return node;
        }else{

            root.setLeft(addNode(n,0,mid-1));
            root.setRight(addNode(n,mid+1,n.length-1));
            return root;
        }




    }


    public void print(){
        inOrderReverse(root);
        System.out.println();
    }

    private void inOrderReverse(Node pointer){
        if(pointer !=null){
            inOrderReverse(pointer.getRight());
            System.out.print(pointer.getValue()+" ");
            inOrderReverse(pointer.getLeft());

        }
    }

    public int deep(){
        return deep(root);
    }

    private int deep(Node pointer){
        if(pointer == null){
            return 0;
        }else if(deep(pointer.getRight())>=deep(pointer.getLeft())){
            return deep(pointer.getRight())+1;

        }else{
            return deep(pointer.getLeft())+1;
        }
    }
}

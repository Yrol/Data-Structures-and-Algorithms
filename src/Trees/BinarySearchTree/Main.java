package Trees.BinarySearchTree;

public class Main {

    public static void main(String[] args) {

        BinarySearchTree bst = new BinarySearchTree();
        bst.insert(5);
        bst.insert(10);
        bst.insert(7);
        bst.insert(2);

        bst.totalElements();

        bst.lookup(5);
    }
}

package Trees.BinarySearchTree;

public class BinarySearchTree {

    Node root;
    int elements;

    public BinarySearchTree() {
        root = null;
        elements = 0;
    }

    public void insert(int value) {
        Node newNode = new Node(value);
        if (root == null) {
            root = newNode;
            elements++;
            return;
        }

        Node current = root;
        Node parent = null;

        while(true) {
            parent = current;
            if(value < current.value) {
                current = current.left;
                if(current == null) {
                    parent.left = newNode;
                    elements++;
                    return;
                }
            } else {
                current = current.right;
                if (current == null) {
                    parent.right = newNode;
                    elements++;
                    return;
                }
            }
        }
    }

    public void totalElements() {
        System.out.println("Elements found:" + elements);
    }

    public void lookup(int value) {

        if (root.value == value) {
            System.out.println("Found value: " + value);
            return;
        }

        Node current = root;

        while(true) {
            current = value < current.value? current.left: current.right;

            if (current == null) {
                return;
            }

            if(current.value == value) {
                System.out.println("Found value:" + value);
                return;
            }
        }
    }
}

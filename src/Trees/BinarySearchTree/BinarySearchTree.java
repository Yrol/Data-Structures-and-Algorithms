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

    /**
     * Look up using divide and conquer
     * **/
    public boolean lookup(int value) {

        if (root.value == value) {
            return true;
        }

        Node current = root;

        while(true) {
            current = value < current.value? current.left: current.right;

            if (current == null) {
                return false;
            }

            if(current.value == value) {
                return true;
            }
        }
    }

    /**
     * traverse through tree using recursive
     * **/
    public void inorderTraversal(Node root) {
        if (root != null) {
            inorderTraversal(root.left);
            System.out.print(root.value + " ");
            inorderTraversal(root.right);
        }
    }
}

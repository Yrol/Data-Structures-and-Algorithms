package StacksAndQueues.StackLinkedListImplementation;

public class LinkedList {

    Node tail;
    Node head;

    public void add(String value) {
        Node newNode = new Node(value);

        if(head == null) {
            head = newNode;
            tail = newNode;
            return;
        }

        // 10->12->13->?->null'
        tail.next = newNode;
        newNode.prev = tail;
        tail = newNode;
    }

    // Deleting the last inserted item (tail value)
    // 10->12->13(X)->null'
    public void delete() {
        Node current = tail;
        tail = tail.prev;
        tail.next = null;
    }

    // Display top item
    public void peek() {
        System.out.println(tail.value);
    }

    public void displayNodes() {
        Node current = head;

        while (current != null) {
            System.out.print(current.value + "->");
            current = current.next;
        }
        System.out.println("null");
    }
}

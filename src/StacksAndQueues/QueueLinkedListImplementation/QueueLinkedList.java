package StacksAndQueues.QueueLinkedListImplementation;

/**
 * A custom Linked list implementation for mimicking queues - First In First Out (FIFO)
 * **/
public class QueueLinkedList {

    Node first;
    Node last;

    /**
     * Adding elements to the last (append)
     * **/
    public void add(String value) {

        Node newNode = new Node(value);

        if (first == null) {
            first = newNode;
            last = newNode;
            return;
        }

        last.next = newNode;
        newNode.next = null;
        last = newNode;
    }

    public void remove() {
        if (first != null) {
            first = first.next;
        }
    }

    public void peek() {
        if (first != null) {
            System.out.println(first.value);
        }
    }

    public void getAll() {

        Node current  = first;

        while(current != null) {
            System.out.print(current.value + "->");
            current = current.next;
        }
        System.out.print("null");
    }
}

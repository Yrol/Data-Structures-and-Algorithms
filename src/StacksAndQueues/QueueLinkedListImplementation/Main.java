package StacksAndQueues.QueueLinkedListImplementation;

/**
 * A custom Linked list implementation for mimicking queues - First In First Out (FIFO)
 * **/
public class Main {

    public static void main(String[] args) {

        QueueLinkedList queueLinkedList = new QueueLinkedList();
        queueLinkedList.add("Toyota");
        queueLinkedList.add("Honda");
        queueLinkedList.add("Hyundai");
        queueLinkedList.remove();
        queueLinkedList.peek();
        queueLinkedList.add("Isuzu");

        queueLinkedList.getAll();
    }
}

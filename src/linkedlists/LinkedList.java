package linkedlists;

import java.util.ArrayList;

/**
 * Custom Linked List
 * 10(head)->5->3(tail)->null
 * **/
public class LinkedList {

    private Node head;

    public void append(int value){
        Node newNode = new Node(value);
        if (head == null) {
            head = newNode;
        } else {
            Node current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }
    }

    public void display() {
        Node current = head;

        while (current != null) {
            System.out.print(current.value + "->");
            current = current.next;
        }

        System.out.println("null");
    }
}

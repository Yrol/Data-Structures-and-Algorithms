package linkedlists;

import java.util.ArrayList;

/**
 * Custom Linked List
 * 10(head)->5->3(tail)->null
 * **/
public class LinkedList {

    private Node head;

    private int length;

    public void append(int value){
        Node newNode = new Node(value);
        if (head == null) {
            head = newNode;
            length++;
        } else {
            Node current = head;
            while (current.next != null) {
                current = current.next;
                length++;
            }
            current.next = newNode;
            length++;
        }
    }

    public void insert(int position, int value) {
        Node newNode = new Node(value);
        if (position == 0) {
            newNode.next = head;
            head = newNode;
            return;
        }

        // Adding the existing values to a temp location until the defined position is met
        Node temp = head;
        for (int i = 1; i < position && temp != null; i++) {
            System.out.println(i);
            temp = temp.next;
        }
        if (temp == null) {
            throw new IndexOutOfBoundsException("Position out of bounds");
        }
        newNode.next = temp.next;
        temp.next = newNode;
    }

    public void prepend(int value) {
        Node newNode = new Node(value);
        newNode.next = head;
        head = newNode;
        length++;
    }

    public void display() {
        Node current = head;

        while (current != null) {
            System.out.print(current.value + "->");
            current = current.next;
        }
        System.out.println("null");
    }

    public int getLength() {
        return length - 1; // exclude null pointer
    }
}

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

        /**
         * Looping through the existing values until the defined position is met
         * Starting with 1 since 0th position is the head
         * **/
        Node temp = head;
        for (int i = 1; i < position && temp != null; i++) {
            temp = temp.next;
        }
        if (temp == null) {
            throw new IndexOutOfBoundsException("Position out of bounds");
        }
        newNode.next = temp.next;
        temp.next = newNode;
    }

    public boolean remove(int index) {
        if (head == null) {
            return false; // List is empty
        }

        // Search for the node to remove
        Node current = head, previous = null;

        // Handling the removal of the 0th element since there's no previous element
        if (index == 0) {
            head = current.next; // Changed head
            return true;
        }


        int counter = 0;
        while (current != null) {
            if (counter == index) {
                // Since the currNode is the required position Unlink currNode from linked list
                previous.next = current.next;
                break;
            } else {
                // If currNode does not hold the value, continue to next node
                previous = current;
                current = current.next;
                counter++;
            }
        }
        length--;
        return true;
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
        return length; // exclude null pointer
    }
}

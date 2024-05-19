package linkedlists;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * Custom doubly Linked List (with pointers to next and previous nodes)
 * 10(head)->5->3(tail)->null
 * **/
public class LinkedList {

    private Node head;
    private Node tail;

    private int length;

    public void append(int value){

        // Without previous node
//        Node newNode = new Node(value);
//        if (head == null) {
//            head = newNode;
//            tail = newNode;
//            length++;
//        } else {
//            Node current = head, prev = null ;
//            while (current.next != null) {
//                current = current.next;
//                length++;
//            }
//            current.next = newNode;
//            length++;
//        }

        // Maintaining previous node
        Node newNode = new Node(value);
        if (head == null) {
            head = newNode;
            tail = newNode;
            length++;
        } else {
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
            length++;
        }
    }

    public void insert(int position, int value) {

        // inserting at the 0th position
        if (position == 0) {
            prepend(value);
            return;
        }

        /**
         * Looping through the existing values until the defined position is met
         * Starting with 1 since 0th position is the head (which is handled above)
         * **/
        Node newNode = new Node(value);
        Node current = head;
        for (int i = 0; i < position - 1 && current != null; i++) {
            current = current.next;
        }

        if (current == null || current.next == null) { // reached the tail
            append(value);
        } else {
            newNode.next = current.next;
            newNode.prev = current;
            current.next.prev = newNode;
            current.next = newNode;
            length++;
        }
    }

    public boolean remove(int index) {
        if (head == null) {
            return false; // List is empty
        }

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
        head.prev = newNode;
        head = newNode;
        length++;
    }

    public void traverse() {
        if(head.next == null) {
            System.out.println(head.value);
        }

//        StringBuilder values = null;
//        if (head != null) {
//            Node currentNode = tail;
//            values = new StringBuilder(Integer.toString(currentNode.value));
//            for(int i = (length -1); i >= 0; i--){
//                currentNode = currentNode.prev;
//                values.append(",").append(Integer.toString(currentNode.value));
//            }
//            System.out.println(values);
//        }

        // Reversing the list without previous pointer (or as a singly List)
        Node first = head;
        tail = head;
        Node second = head.next;
        while (second != null) {
            Node temp = second.next;
            second.next = first;
            first = second;
            second = temp;
        }
        head.next = null;
        this.head = first;
        display();

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

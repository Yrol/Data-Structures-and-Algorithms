package StacksAndQueues.StackLinkedListImplementation;

public class Main {

    public static void main(String[] args) {
        LinkedList linkedList = new LinkedList();
        linkedList.add("John");
        linkedList.add("Isaac");
        linkedList.add("George");
        linkedList.delete();
        linkedList.displayNodes();
        linkedList.peek();
    }
}

package linkedlists;

public class Main {

    public static void main(String[] args) {
         LinkedList linkedList = new LinkedList();
         linkedList.append(5);
         linkedList.append(10);
         linkedList.append(12);
         linkedList.prepend(89);
         linkedList.insert(4, 900);
         linkedList.remove(3); // 89->5->900->10->12->null
        linkedList.append(67);
        linkedList.append(51);

        linkedList.display();
//        System.out.println(linkedList.getLength());

        linkedList.traverse();
    }
}

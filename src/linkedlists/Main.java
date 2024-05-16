package linkedlists;

public class Main {

    public static void main(String[] args) {
         LinkedList linkedList = new LinkedList();
         linkedList.append(5);
         linkedList.append(10);
         linkedList.append(12);
         linkedList.prepend(89);
         linkedList.insert(2, 900);

         linkedList.display();
//
//        System.out.println(linkedList.getLength());
    }
}

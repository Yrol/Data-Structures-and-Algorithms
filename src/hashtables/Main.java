package hashtables;

public class Main {

    public static void main(String[] args) {

        HashTable hashTable = new HashTable(3);
        hashTable.set("Grapes", 1000);
        hashTable.set("Apples", 500);
        hashTable.set("Grapes", 2000);
        hashTable.set("Apples", 8000);
        hashTable.set("Grapes", 5000);

        hashTable.get("Grapes");
        hashTable.get("Apples");

        System.out.println(hashTable.keys());
    }
}

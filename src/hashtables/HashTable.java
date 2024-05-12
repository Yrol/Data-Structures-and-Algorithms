package hashtables;

import java.util.ArrayList;
import java.util.Objects;

public class HashTable {

    // Using object buckets to store array of data (keys and values using the CustomObject)
    private final Object[] bucket;

    public HashTable(int length) {
        bucket = new Object[length];
    }

    /**
     * A simple function to generate a hash value
     * charAt: returns an integer between 0 and 65535 that represents a character in memory
     * The following function will:
     * - Take the character address - will return an int
     * - Multiply it by current index to make it unique
     * - Adding to the incrementing hash value
     * - % by array length to make sure it stays within the size of the array
     **/
    public int hash(String key) {
        int hash = 0;

        for (int i = 0; i < key.length(); i++) {
            hash = (hash + key.charAt(i) * i) % bucket.length;
        }
        return hash;
    }

    /**
     * Setting values using keys specific memory locations
     **/
    public void set(String key, Object value) {
        int address = this.hash(key);

        // Handling data collision in hashtables - if the address is not empty append values to the existing array
        if (bucket[address] != null) {
            CustomObject[] existingItems = (CustomObject[]) bucket[address];
            CustomObject[] newItems = new CustomObject[existingItems.length + 1];

            for (int i = 0; i < newItems.length - 1; i++) {
                newItems[i] = existingItems[i];
            }
            newItems[newItems.length - 1] = new CustomObject(key, value); // adding the new element at last
            bucket[address] = newItems;
        } else {
            bucket[address] = new CustomObject[]{new CustomObject(key, value)};
        }
    }

    /**
     * Getting the latest value using a key in a specific memory location
     **/
    public void get(String key) {
        int address = this.hash(key);

        if (bucket[address] != null) {
            CustomObject[] existingItems = (CustomObject[]) bucket[address];

            // Iterate through array in reserve order since the latest items are always added to the end of the array in set() above
            for (int i = existingItems.length - 1; i > 0; i--) {
                if (Objects.equals(existingItems[i].getKey(), key)) {
                    System.out.println(existingItems[i].getValue());
                    break;
                }
            }
        }
    }


    /**
     * Method for getting keys
     * As shown getting all available keys from a hashtable is has a high performance overhead, hence an application requires such options should consider other data structures.
     **/
    public ArrayList<String> keys() {
        ArrayList<String> nonEmptyBuckets = new ArrayList<>();
        for (Object data : bucket) {
            if (data != null) {
                for (CustomObject item : (CustomObject[]) data) {
                    nonEmptyBuckets.add(item.getKey());
                }

            }
        }
        return nonEmptyBuckets;
    }
}

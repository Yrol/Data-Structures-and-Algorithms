package recurringCharacter;

import java.util.HashMap;

public class RecurringCharacterHashTables {

    public static void main(String[] args) {
        int[] arr1 = {2, 5, 1, 4, 3, 5, 1, 6, 2};
        int[] arr2 = {2, 1, 1, 2, 3, 5, 1, 2, 4};
        System.out.println(findRecurringElementsCustomHashMap(arr1));
        System.out.println(findRecurringElementsCustomHashMap(arr2));
        System.out.println(findRecurringElementsJavaHashMap(arr2));
        System.out.println(findRecurringElementsJavaHashMap(arr2));
    }

    public static String findRecurringElementsCustomHashMap(int[] array) {
        int arrayLength = array.length;
        Object[] hashObjects = new Object[arrayLength];

        for (int j : array) {
            int address = hash(arrayLength, Integer.toString(j));

            if (hashObjects[address] != null) {
                return "First recurring element custom hashmap:" + Integer.toString(j);
            } else {
                hashObjects[address] = Integer.toString(j);
            }
        }
        return "No recurring elements found in custom hashmap";
    }

    public static String findRecurringElementsJavaHashMap(int[] array) {

        HashMap<String, String> valuesMap = new HashMap<>();

        for (int j : array) {

            if (valuesMap.containsKey(Integer.toString(j))) {
                return "First recurring element Java hashmap:" + Integer.toString(j);
            } else {
                valuesMap.put(Integer.toString(j), Integer.toString(j));
            }
        }

        return "No recurring elements found in Java hashmap";
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
    public static int hash(int bucketLength, String key) {
        int hash = 0;

        for (int i = 0; i < key.length(); i++) {
            hash = (hash + key.charAt(i) * i) % bucketLength;
        }
        return hash;
    }
}

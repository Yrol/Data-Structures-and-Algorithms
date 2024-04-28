package arrays;

import java.util.Arrays;

public class Arrays01 {

    public static void main(String[] args) {

        String[] array = {"a", "b", "c"};

        System.out.println(Arrays.toString(addElement(array, "x")));

        System.out.println(Arrays.toString(unshift(array, "k")));

        System.out.println(Arrays.toString(splice(array, 3, "m")));

    }

    /**
     * Adding an item to the end of the array
     * time complexity -  O(n) as it depends on the size of the existing array
     * Since this is O(n), this might not be the best solution to add items to a data structure
     **/
    public static String[] addElement(String[] array, String newElement) {

        int arrayLength = array.length + 1;

        String[] newArray = new String[arrayLength];

        for (int i = 0; i < array.length; i++) {
            newArray[i] = array[i];
        }

        // adding to the last element of the array
        newArray[arrayLength - 1] = newElement;

        return newArray;
    }

    /**
     * Move indexes of an exiting array to the right and add an item to the beginning of the array
     * time complexity -  O(n) as it depends on the size of the existing array
     * Since this is O(n), this might not be the best solution to add items to a data structure
     **/
    public static String[] unshift(String[] arr, String element) {

        String[] array = new String[arr.length + 1];

        array[0] = element;

        for (int i = 1; i < array.length; i++) {
            array[i] = arr[i - 1];
        }

        return array;
    }


    /**
     * Move indexes of an exiting array and add and element anywhere (start, middle or end)
     * time complexity -  O(n) as it depends on the size of the existing array
     * Since this is O(n), this might not be the best solution to add items to a data structure
     **/
    public static String[] splice(String[] arr, int startIndex, String str) {

        boolean elementAdded = false;

        if (startIndex > arr.length) {
            return arr;
        }

        String[] array = new String[arr.length + 1];

        for (int i = 0; i < array.length; i++) {

            if (i == startIndex) {
                array[i] = str;
                elementAdded = true;
                continue;
            }

            array[i] = elementAdded ? arr[i - 1] : arr[i];
        }

        return array;
    }

}

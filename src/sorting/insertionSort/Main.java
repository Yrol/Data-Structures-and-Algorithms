package sorting.insertionSort;

import java.util.Arrays;

public class Main {

    /**
     * Insertion Sort - A sorting algorithm working from left to right.
     * Examine each item and compare it with the left and insert them in the correct position as demonstrated in: https://www.youtube.com/watch?v=JU767SDMDvA
     * **/
    public static int[] insertSort(int[] array) {
        int n = array.length;

        // Iterate over the array
        for (int i = 1; i < n; i++) {
            int key = array[i];
            int j = i - 1;

            // Move elements of array[0..i-1], that are greater than key, to one position ahead of their current position
            while (j >= 0 && array[j] > key) {
                array[j + 1] = array[j];
                j = j - 1;
            }
            array[j + 1] = key;
        }

        return array;
    }

    public static void main(String[] args) {
        int[] array = {2, 5, 1, 4, 8, 7};
        System.out.println(Arrays.toString(insertSort(array)));
    }
}

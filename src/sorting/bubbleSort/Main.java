package sorting.bubbleSort;

import java.util.Arrays;

public class Main {

    public static int[] bubbleSortUsingWhile(int[] arr) {
        int counter = 0;
        int sortAttempts = 0;
        while (true) {

            if (counter == arr.length - 1) {

                if (sortAttempts == 0) {
                    break;
                }
                counter = 0;
                sortAttempts = 0;
                continue;
            }

            int currentElement = arr[counter];
            int nextElement = arr[counter + 1];
            if (currentElement > nextElement) {
                arr[counter] = nextElement;
                arr[counter + 1] = currentElement;
                sortAttempts++;
            }
            counter++;
//            System.out.println(Arrays.toString(arr));
        }
        return arr;
    }

    public static int[] bubbleSortUsingFor(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if(arr[i] < arr[j]) {
                    int temp = arr[j];
                    arr[j] = arr[i];
                    arr[i] = temp;
                }
            }
        }
        return arr;
    }

    public static void main(String[] args) {

        int[] arr1 = {2, 5, 1, 4, 8, 7};
        int[] arr2 = {3, 5, 1, 2, 8, 10};
        System.out.println("Using while loop:" + Arrays.toString(bubbleSortUsingWhile(arr1)));
        System.out.println("Using for loop:" + Arrays.toString(bubbleSortUsingFor(arr2)));
    }
}

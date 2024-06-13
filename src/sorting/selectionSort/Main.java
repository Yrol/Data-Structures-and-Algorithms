package sorting.selectionSort;

import java.util.Arrays;

/**
 * Implementing the selection sort using For and While loop
 * Time complexity O(n^2) - due to nested loops are being used
 * **/
public class Main {

    public static int[] selectionSortUsingWhile(int[] arr) {

        int currentPosition = 0;
        int iterator = 0;
        int currentSmallestLoc = currentPosition;

        while(currentPosition != arr.length - 1) {

            // Reassigning the current smallest value location if the current iteration value is smaller
            if(arr[iterator] <  arr[currentSmallestLoc]) {
                currentSmallestLoc = iterator;
            }

            if(iterator == arr.length - 1) {

                if(arr[currentPosition] > arr[currentSmallestLoc]) {
                    int temp = arr[currentPosition];
                    arr[currentPosition] = arr[currentSmallestLoc];
                    arr[currentSmallestLoc] = temp;
                }

                currentPosition++;
                iterator = currentSmallestLoc = currentPosition;
            }

            iterator++;
        }

        return arr;
    }

    public static int[] selectionSortUsingFor(int[] arr) {

        for(int i = 0; i < arr.length; i++) {
            int minLoc =  i;
            for(int j = i + 1; j < arr.length; j++) {
                if(arr[j] < arr[minLoc]) {
                    minLoc = j;
                }
            }

            // Reassigning the current smallest value location if the current iteration value is smaller
            if (arr[i] > arr[minLoc]) {
                int temp = arr[i];
                arr[i] = arr[minLoc];
                arr[minLoc] = temp;
            }
        }
        return arr;
    }

    public static void main(String[] args) {

        int[] arrWhile = {8,5,2,6,9,3,1,4,0,7};
        int[] arrFor = {8,5,2,6,9,3,1,4,0,7};


        System.out.println(Arrays.toString(selectionSortUsingWhile(arrWhile)));
        System.out.println(Arrays.toString(selectionSortUsingFor(arrFor)));

    }
}

package arrays.array;

import java.util.Arrays;

public class MergeArray {

    public static void main(String[] args) {

        int[] arr1 = {0, 3, 5, 31};
        int[] arr2 = {4, 6, 30};

        System.out.println(Arrays.toString(mergeArray(arr1, arr2)));
    }

    private static int[] mergeArray(int[] array1, int[] array2) {
        int[] tempArr = new int[array1.length + array2.length];

        if (array1.length == 0) {
            return array2;
        }

        if (array2.length == 0) {
            return array1;
        }

        for (int i = 0; i < array2.length; i++) {
            tempArr[i] = array2[i];
        }

        for (int i = 0; i < array1.length; i++) {
            tempArr[i + array2.length] = array1[i];
        }

        return tempArr;
    }
}

package recurringCharacter;

public class RecurringCharacterArrays {

    public static void main(String[] args) {
        int[] arr1 = {2, 5, 1, 4, 3, 5, 1, 6, 2};
        int[] arr2 = {2, 1, 1, 2, 3, 5, 1, 2, 4};
        int[] arr3 = {2, 3, 4, 5};
        int[] arr4 = {1};
        int[] arr5 = {};

        // While loop
        findRecurringChar(arr1);
        findRecurringChar(arr2);
        findRecurringChar(arr3);
        findRecurringChar(arr4);
        findRecurringChar(arr5);

        // For loop
        System.out.println(findRecurringCharUsingNestedFor(arr1));
    }

    /**
     * Using a while loop instead of nested for loops.
     **/
    private static void findRecurringChar(int[] arr) {
        int arrayLength = arr.length;
        int counter = 0;
        int mainCounter = 0;
        boolean found = false;

        while (mainCounter != (arrayLength - 1) && arrayLength != 0) {

            if (mainCounter != counter && arr[counter] == arr[mainCounter]) {
                found = true;
                break;
            }

            if (counter == (arrayLength - 1)) {
                counter = 0;
                mainCounter++;
            }
            counter++;

//            System.out.println("Counter:" + counter);
//            System.out.println("Main counter:" + mainCounter);
        }

        String message = found ? "Recurring Character found:" + arr[counter] : "Not found";

        System.out.println(message);
    }

    /**
     * Searching for recurring elements using nested For loops - causing poor performance due to efficiency being quadratic.
     * **/
    private static String findRecurringCharUsingNestedFor(int[] arr) {
        int arrayLength = arr.length;

        for (int i = 0; i < arrayLength; i++) {
            for (int j = i; j < arrayLength; j++) {

                if (j == i) {
                    continue;
                }

                if (arr[i] == arr[j]) {
                    return "Recurring element found:"  + Integer.toString(arr[i]);
                }
            }
        }

        return "not found";
    }
}

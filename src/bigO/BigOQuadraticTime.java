package bigO;

/**
 * Quadratic time O(n²) or O(n^n) - This will occur when there are nested loops like below.
 * This is poor performance, and it's called quadratic since every time an element increase, the operations will increase quadratically n².
 **/

public class BigOQuadraticTime {

    public static void main(String[] args) {
        String[] array1 = {"a", "b", "c"};
        String[] array2 = {"d", "e", "f"};

        for (int i = 0; i < array1.length; i++) {
            for (int j = 0; j < array2.length; j++) {
                System.out.println(array1[i] + ":" + array2[j]);
            }
        }
    }
}

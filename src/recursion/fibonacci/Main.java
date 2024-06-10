package recursion.fibonacci;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {

    // 0,1,1,2,3,5,8,13,21,34,55,89,144 ...
    // the pattern of the sequence is that each value is the sum of the 2 previous values, that means that for N=5 -> 2+3 = 5, N=6 -> 3+5 = 8 and so on

    /**
     * Using loops
     * time complexity: O(n)
     * **/
    public static int[] fibonacciIterative(int n) {

        int[] fibonacci = new int[2];

        int prev = 0;
        int curr = 0;
        for(int i = 0; i < n; i++) {
            if (i == 1) {
                prev = 0;
                curr = 1;
                continue;
            }
            int temp = curr + prev;
            prev = curr;
            curr = temp;
        }

        fibonacci[0] = prev;
        fibonacci[1] = curr;
        System.out.println(prev + ":" + curr + "=" + (prev + curr));

        return fibonacci;
    }

    /**
     * Using recursive
     * For n > 1, the function calls itself with the arguments n-1 and n-2 and returns the sum of these calls
     * Time complexity: O(2^n) - compared to the above loop, this is not great.
     * **/
    public static int fibonacciRecursive(int n) {

        // Base cases
//        if (n <= 0) {
//            return 0;
//        } else if (n == 1) {
//            return 1;
//        }
        if (n < 2) {
            return n;
        }
        // Recursive case
        return fibonacciRecursive(n - 1) + fibonacciRecursive(n - 2);
    }


    public static void main(String[] args) {
        fibonacciIterative(8);
        System.out.println("Fibonacci Recursive:" + fibonacciRecursive(6));
    }
}

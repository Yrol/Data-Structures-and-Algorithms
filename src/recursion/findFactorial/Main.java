package recursion.findFactorial;

public class Main {

    /**
     * Find factorial using loop
     * Time complexity: O(n)
     * **/
    public static int factorialUsingLoop(int number) {

        int factorial = number * --number;
        while(number > 1) {
            factorial = factorial * --number;
        }
        return factorial;
    }

    /**
     * Find factorial using recursion
     * Time complexity: O(n)
     * **/
    public static int factorialUsingRecursion(int number) {

        if (number == 1){
            return number;
        }
        int recursiveResult = factorialUsingRecursion(number - 1); // will be executed when: number not equal 1
        return recursiveResult * number; // will be executed when return number as 1. Then the recursiveResult will be multiplied by 1.
    }

    public static void main(String[] args) {
        System.out.println("factorialUsingLoop:" + factorialUsingLoop(7));
        System.out.println("factorialUsingRecursion:" + factorialUsingRecursion(5));
    }
}

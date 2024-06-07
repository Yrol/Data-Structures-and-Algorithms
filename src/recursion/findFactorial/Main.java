package recursion.findFactorial;

public class Main {

    public static int factorialUsingLoop(int number) {

        int factorial = number * --number;
        while(number > 1) {
            factorial = factorial * --number;
        }
        return factorial;
    }

    public static int factorialUsingRecursion(int number) {

        if (number == 1){
            return 1;
        }
        int recursiveResult = factorialUsingRecursion(number - 1); // will be executed when: number not equal 1
        return recursiveResult * number; // will be executed when: number == 1 / when return 1
    }

    public static void main(String[] args) {
        System.out.println("factorialUsingLoop:" + factorialUsingLoop(7));
        System.out.println("factorialUsingRecursion:" + factorialUsingRecursion(5));
    }
}

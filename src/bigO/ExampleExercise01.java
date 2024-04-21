package bigO;


import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * Example of avoiding quadratic BigO when comparing 2 arrays for common elements.
 * Instead of using two for loops we could rely on HashSets for constant time O(1), where finding data in HashSets in linear / constant.
 * A single for loop can be used as shown below.
 * More improvements:
 * 1. We could also make sure the largest input array will always be assigned to the HashSet and then can use the smallest to loop through using the for loop.
 *    Set<String> strings = HashSet<String>(input1.length > input2.length ? Array.asList(input1): Array.asList(input2));
 * 2. After doing the above the shortest array needs to be assigned to teh for loop.
 * 3. Caveats: If the arrays are of the same length, need to mechanism to handle the above points differently.
 * The time complexity of the below solution is O(a+b) -> where a = input1 and b = input2
 * The Space complexity of the below solution is O(1) -> as we're adding array values to a Set.
 * **/

public class ExampleExercise01 {

    public static void main(String[] args) {

        String[] array1 = {"x", "y", "z"};
        String[] array2 = {"a", "b", "b", "c", "y"};

        System.out.println(findCommonItems(array1, array2) ? "Found" : "Not found");
    }

    private static Boolean findCommonItems(String[] input1, String[] input2){

        if(input1.length == 0 || input2.length == 0) {
            return false;
        }

        Set<String> strings = new HashSet<>(Arrays.asList(input2)); // Space complexity O(1). Duplicates are ignored. Ex: "b"

        System.out.println(strings);

        for (String s: input1) {
            if(strings.contains(s)){
                return true;
            }
        }
        return false;

        //Time complexity: O(a+b) -> where a = input1 and b = input2.
    }
}

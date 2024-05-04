package arrays.array;

import java.util.Arrays;

public class Arrays02 {

    public static void main(String[] args) {

        MyArray myArray = new MyArray(9);
        myArray.push("Hello");
        myArray.push("Hello1");
        myArray.push("Hello2");
        myArray.pop(); // Remove last item
        myArray.delete(1); // Remove from a given index
        System.out.println(Arrays.toString(myArray.getAll()));
    }
}

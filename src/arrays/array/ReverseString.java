package arrays.array;

import java.util.Arrays;

public class ReverseString {

    public static void main(String[] args) {

        String[] word = ("Hello").split("");
        String reverseString = "";

        for (int i = word.length - 1; i >=0; i--) {
            reverseString += word[i];
        }

        System.out.println(reverseString);
    }
}

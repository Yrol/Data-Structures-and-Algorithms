package bigO;


/**
 * Constant time O(1) - The operation will remain always constant.
 * Following is an example where regardless of number of elements it will pick the first item of the array / 0th element to print, hence its O(1).
 * **/
public class BigOConstantTime {

    public static void main(String[] args) {

        String[] movies = {"Superman", "Spiderman", "Batman"};

        for(String s: movies) {
            System.out.println(movies[0]);
        }
    }
}

package bigO;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BigOLinearTime {

    /**
     * Linear time O(n) - The operations grow linearly as the complexity increases.
     * Following FOR loop is an example of linear increase where it grows by one operation at a time as elements increase.
     * The n will be number of elements. Ex: 10 elements will be: O(10)
     */

    public static void main(String[] args) {

        List<String> largeList = new ArrayList<String>(Collections.nCopies(100000, "Nemo"));

        for (String val : largeList) {
            System.out.println(val);
        }
    }
}

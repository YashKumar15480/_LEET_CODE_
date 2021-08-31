import java.util.ArrayList;
import java.util.Collections;

class Solution {
    public int findLucky(int[] arr) {

        ArrayList<Integer> l1 = new ArrayList<>();

        for (int i = 0; i < arr.length; i++) {
            int count = 0;
            for (int j = 0; j < arr.length; j++) {
                // if(i!=j)
                if (arr[i] == arr[j])
                    count++;
            }
            if (count == arr[i])
                l1.add(arr[i]);
        }

        if (l1.size() < 1)
            return -1;
        else
            return Collections.max(l1);
    }
}

public class Find_Lucky_Integer_in_an_Array {
    public static void main(String[] args) {

    }
}

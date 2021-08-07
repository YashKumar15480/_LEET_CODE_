import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        Arrays.sort(arr);
        int count = 1;

        if (arr.length == 2 && arr[0] == arr[1])
            return true;
        if (arr.length == 2 && arr[0] != arr[1])
            return false;

        Set<Integer> s1 = new HashSet<>();

        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] == arr[i + 1])
                count++;
            else {
                if (s1.contains(count))
                    return false;
                s1.add(count);
                count = 1;
            }
        }
        return true;

    }
}

public class Unique_Number_of_Occurrences {
    public static void main(String[] args) {

    }
}

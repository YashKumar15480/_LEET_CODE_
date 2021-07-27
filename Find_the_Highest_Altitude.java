import java.util.Arrays;

class Solution {
    public int largestAltitude(int[] gain) {
        int a[] = new int[gain.length + 1];
        a[0] = 0;
        for (int i = 1; i < a.length; i++) {
            a[i] = gain[i - 1] + a[i - 1];
        }
        Arrays.sort(a);
        return a[a.length - 1];
    }
}

public class Find_the_Highest_Altitude {
    public static void main(String[] args) {

    }

}

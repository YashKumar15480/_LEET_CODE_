import java.util.Arrays;

class Solution {
    public int heightChecker(int[] heights) {
        int a[] = new int[heights.length];
        for (int i = 0; i < heights.length; i++)
            a[i] = heights[i];
        int count = 0;
        Arrays.sort(a);

        for (int i = 0; i < a.length; i++)
            if (a[i] != heights[i])
                count++;

        return count;

    }

}

public class Height_Checker {
    public static void main(String[] args) {

    }
}
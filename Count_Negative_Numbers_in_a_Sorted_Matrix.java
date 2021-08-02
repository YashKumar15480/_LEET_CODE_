import java.util.Arrays;

class Solution {
    public int countNegatives(int[][] grid) {
        int res = 0;
        for (int i = 0; i < grid.length; i++) {
            res += pass(grid[i]);
        }
        return res;
    }

    public int pass(int[] grid) {
        int count = 0;
        Arrays.sort(grid);
        int i = 0;
        while (i < grid.length && grid[i] < 0) {
            count++;
            i++;
        }
        return count;
    }
}

public class Count_Negative_Numbers_in_a_Sorted_Matrix {
    public static void main(String[] args) {

    }
}

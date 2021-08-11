class Solution {
    public boolean isCovered(int[][] ranges, int left, int right) {
        boolean[] vis = new boolean[51];

        for (int i = 0; i < ranges.length; i++) {
            for (int j = ranges[i][0]; j <= ranges[i][1]; j++) {
                vis[j] = true;
            }
        }

        for (int i = left; i <= right; i++)
            if (!vis[i])
                return false;
        return true;
    }
}

public class Check_if_All_the_Integers_in_a_Range_Are_Covered {
    public static void main(String[] args) {

    }
}
class Solution {
    public int getMinDistance(int[] nums, int target, int start) {

        int min = Integer.MAX_VALUE;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == target)

                if (min > Math.abs(i - start))

                    min = Math.abs(i - start);
        }

        return min;
    }
}

public class Minimum_Distance_to_the_Target_Element {
    public static void main(String[] args) {

    }
}

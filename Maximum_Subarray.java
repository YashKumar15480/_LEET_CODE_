class Solution {
    public int maxSubArray(int[] nums) {

        int a = nums[0];
        int b = nums[0];
        for (int i = 1; i < nums.length; i++) {
            int num = nums[i];

            a = Math.max(num, a + num);

            b = Math.max(b, a);
        }
        return b;

    }
}

/**
 * Maximum_Subarray
 */
public class Maximum_Subarray {

    public static void main(String[] args) {

    }
}
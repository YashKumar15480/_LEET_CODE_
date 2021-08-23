class Solution {
    public int subsetXORSum(int[] nums) {
        int n = nums.length;
        int sum = 0;

        int sub = (int) (1 << n) - 1;

        for (int i = 0; i <= sub; i++) {
            int t = i, j = 0, xor = 0;
            while (t > 0) {
                if ((t & 1) == 1)
                    xor ^= nums[j];
                j++;
                t >>= 1;
            }
            sum += xor;
        }
        return sum;
    }
}

public class Sum_of_All_Subset_XOR_Totals {
    public static void main(String[] args) {

    }
}
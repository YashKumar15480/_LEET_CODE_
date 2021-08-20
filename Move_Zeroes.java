class Solution {
    public void moveZeroes(int[] nums) {

        int zero = 0, temp = 0;
        int count = 0, j = 0;
        for (int i = 0; i < nums.length; i++)
            if (nums[i] == zero)
                count++;

        while (j != count) {
            for (int i = 0; i < nums.length - 1; i++) {
                if (nums[i] == zero) {
                    temp = nums[i];
                    nums[i] = nums[i + 1];
                    nums[i + 1] = temp;
                }
            }
            j++;
            // k
        }
    }
}

public class Move_Zeroes {
    public static void main(String[] args) {

    }

}

class Solution {
    public int[] sortArrayByParity(int[] nums) {

        int even = 0;
        int odd = nums.length - 1;

        while (even < odd) {

            if (nums[even] % 2 == 1) {
                int temp = nums[odd];
                nums[odd] = nums[even];
                nums[even] = temp;
                odd--;
            } else {
                even++;
            }

        }

        return nums;
    }
}

// package LEET CODE SQL CODES;

public class Sort_Array_By_Parity {
    public static void main(String[] args) {

    }
}

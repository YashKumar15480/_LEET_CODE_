class Solution {
    public int minOperations(int[] nums) {

        int count = 0;
        for (int i = 1; i <= nums.length - 1; i++) {
            if (nums[i] <= nums[i - 1]) {
                count = count + nums[i - 1] + 1 - nums[i];
                nums[i] = nums[i - 1] + 1;
            }
        }
        return count;
    }
}

public class Minimum_Operations_to_Make_the_Array_Increasing {
    public static void main(String[] args) {

    }

}

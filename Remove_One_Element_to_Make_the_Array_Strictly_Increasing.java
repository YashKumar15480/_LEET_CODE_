class Solution {
    public boolean canBeIncreasing(int[] nums) {
        int count = 0;
        int n = nums.length;
        for (int i = 1; i < n; i++) {
            if (nums[i] <= nums[i - 1]) {
                if (i > 1 && nums[i] <= nums[i - 2]) {
                    if (i < n - 1 && nums[i + 1] <= nums[i - 1])
                        return false;
                }
                count++;
                if (count > 1)
                    return false;
            }
        }
        return true;
    }
}

public class Remove_One_Element_to_Make_the_Array_Strictly_Increasing {
    public static void main(String[] args) {

    }
}

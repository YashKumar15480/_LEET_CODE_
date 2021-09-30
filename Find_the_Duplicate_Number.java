import java.util.Arrays;

class Solution {
    public int findDuplicate(int[] nums) {

        Arrays.sort(nums);

        for (int i = 0; i < nums.length - 1; i++)
            if (nums[i] == nums[i + 1])
                return nums[i + 1];

        return 0;
    }
}

public class Find_the_Duplicate_Number {
    public static void main(String[] args) {

    }
}

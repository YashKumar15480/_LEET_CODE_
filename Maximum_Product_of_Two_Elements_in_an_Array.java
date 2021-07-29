import java.util.Arrays;

class Solution {
    public int maxProduct(int[] nums) {

        Arrays.sort(nums);

        if (nums.length < 2)
            return nums[0];
        else
            return ((nums[nums.length - 2] - 1) * (nums[nums.length - 1] - 1));

    }
}

public class Maximum_Product_of_Two_Elements_in_an_Array {
    public static void main(String[] args) {

    }
}

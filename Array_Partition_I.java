import java.util.Arrays;

class Solution {
    public int arrayPairSum(int[] nums) {

        int sum = 0;
        Arrays.sort(nums);

        for (int i = 0; i < nums.length; i += 2) {
            sum = sum + nums[i];

        }
        return sum;
    }
}

public class Array_Partition_I {
    public static void main(String[] args) {

    }

}

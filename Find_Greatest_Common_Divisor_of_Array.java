import java.util.Arrays;

class Solution {
    public int findGCD(int[] nums) {

        Arrays.sort(nums);

        int a = nums[0];
        int b = nums[nums.length - 1];

        int flag = 0;

        for (int i = 2; i <= b; i++) {
            if (a % i == 0 && b % i == 0)
                flag = i;
        }

        if (flag == 0)
            return 1;
        else
            return flag;
    }
}

public class Find_Greatest_Common_Divisor_of_Array {
    public static void main(String[] args) {

    }
}
class Solution {
    public boolean isMonotonic(int[] nums) {

        boolean s1 = true;
        boolean s2 = true;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] > nums[i - 1])
                s2 = false;
            if (nums[i] < nums[i - 1])
                s1 = false;

        }
        return s1 || s2;
    }
}

public class Monotonic_Array {
    public static void main(String[] args) {

    }
}

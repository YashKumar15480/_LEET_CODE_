class Solution {
    public int missingNumber(int[] nums) {
        int size = nums.length;
        for (int i = 0; i < nums.length; i++) {
            size ^= i ^ nums[i];
        }
        return size;
    }
}

public class Missing_Number {
    public static void main(String[] args) {

    }

}

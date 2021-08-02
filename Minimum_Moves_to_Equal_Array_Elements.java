class Solution {
    public int minMoves(int[] nums) {
        int sum = 0;
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
            if (nums[i] < min)
                min = nums[i];

        }
        int minMoves = sum - ((nums.length) * (min));
        return minMoves;
    }
}

public class Minimum_Moves_to_Equal_Array_Elements {
    public static void main(String[] args) {

    }

}

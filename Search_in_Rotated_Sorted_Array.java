class Solution {
    public int search(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == target)
                return i;
        }
        return -1;
    }
}

public class Search_in_Rotated_Sorted_Array {
    public static void main(String[] args) {

    }
}

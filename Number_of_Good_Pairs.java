class Solution {
    public int numIdenticalPairs(int[] nums) {
        int size = nums.length;
        int count = 0;
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if (nums[i] == nums[j] && i < j)
                    count++;
            }
        }
        return count;
    }
}

public class Number_of_Good_Pairs {
    public static void main(String[] args) {

    }
}

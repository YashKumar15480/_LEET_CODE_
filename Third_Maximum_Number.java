class Solution {
    public int thirdMax(int[] nums) {
        int count = 1, temp = 0, index = 0;

        // Sorting the array in descending order

        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[j] > nums[i]) {
                    temp = nums[i];
                    nums[i] = nums[j];
                    nums[j] = temp;
                }
            }
        }

        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] != nums[i + 1]) {
                count++;
            }
            if (count == 3) {
                index = i + 1;
                break;
            }
        }

        if (count < 3)
            return nums[0];
        else
            return nums[index];
    }

}

public class Third_Maximum_Number {
    public static void main(String[] args) {

    }

}

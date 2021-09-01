class Solution {
    public void sortColors(int[] nums) {
        int index = 0;
        // this loop is for color no
        for (int i = 0; i < 2; i++) {
            // this loop is for each element of the array
            for (int j = 0; j < nums.length; j++) {
                if (nums[j] == i) {
                    int no = nums[index];
                    nums[index] = nums[j];
                    nums[j] = no;
                    index++;
                }
            }
        }

    }
}

public class Sort_Colors {
    public static void main(String[] args) {

    }
}
import java.util.ArrayList;

class Solution {
    public int findNumbers(int[] nums) {

        ArrayList<Integer> l1 = new ArrayList<Integer>();
        for (int i = 0; i < nums.length; i++) {
            int n = nums[i];
            int count = 0;
            while (n != 0) {
                n = n / 10;
                ++count;
            }
            if (count % 2 == 0)
                l1.add(nums[i]);

        }

        return l1.size();
    }
}

public class Find_Numbers_with_Even_Number_of_Digits {
    public static void main(String[] args) {

    }
}

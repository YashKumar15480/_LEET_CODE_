class Solution {
    public int repeatedNTimes(int[] nums) {

        for (int i = 0; i < nums.length; i++) {
            // int count =0;
            for (int j = 0; j < nums.length; j++) {
                if (i != j)
                    if (nums[i] == nums[j])
                        return nums[i];
            }
            // if(count > 0) return nums[i];//
        }

        return 0;
    }
}

public class N_Repeated_Element_in_Size_2N_Array {
    public static void main(String[] args) {

    }

}

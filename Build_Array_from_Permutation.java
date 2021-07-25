class Solution {
    public int[] buildArray(int[] nums) {

        int size = nums.length;
        int a[] = new int[size];

        for (int i = 0; i < size; i++) {
            a[i] = nums[nums[i]];
        }
        return a;
    }
}

public class Build_Array_from_Permutation {
    public static void main(String[] args) {

    }
}

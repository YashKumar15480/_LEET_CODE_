class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int size = nums.length;
        int a[] = new int[size];
        int count = 0, n = 0;
        for (int i = 0; i < size; i++) {
            count = 0;
            n = nums[i];
            for (int j = 0; j < size; j++) {
                if (nums[j] < n)
                    count++;
            }
            a[i] = count;
        }
        return a;
    }
}

// package LEET CODE SQL CODES;

public class How_Many_Numbers_Are_Smaller_Than_the_Current_Number {
    public static void main(String[] args) {

    }
}

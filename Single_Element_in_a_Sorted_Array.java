class Solution {
    public int singleNonDuplicate(int[] nums) {
        if (nums.length == 1)
            return nums[0];
        for (int i = 1; i < nums.length; i = i + 2) {
            if (nums[i - 1] != nums[i])
                return nums[i - 1];
        }

        return nums[nums.length - 1];
    }
}

/**
 * new
 */
public class Single_Element_in_a_Sorted_Array {
    public static void main(String[] args) {

    }

}

// another soultion but with high time complecity

// class Solution {
// public int singleNonDuplicate(int[] nums) {

// int size = nums.length;
// int temp=0,count=0;
// int j=0;
// for(int i=0;i<size;i++)
// {
// temp=nums[i];
// for( j=0;j<size;j++)
// {
// if(nums[j]==temp)count++;
// }
// if(count == 1) break;
// else count = 0;
// }

// return temp;
// }
// }

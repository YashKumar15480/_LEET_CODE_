import java.util.ArrayList;

class Solution {
    public int[] sortArrayByParityII(int[] nums) {
        ArrayList<Integer> l1 = new ArrayList<Integer>();
        ArrayList<Integer> l2 = new ArrayList<Integer>();
        ArrayList<Integer> l3 = new ArrayList<Integer>();

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] % 2 == 0)
                l1.add(nums[i]);
            else
                l2.add(nums[i]);
        }

        for (int i = 0; i < l1.size(); i++) {
            l3.add(l1.get(i));
            l3.add(l2.get(i));
        }

        int a[] = new int[l3.size()];
        int y = 0;
        for (int i : l3)
            a[y++] = i;

        return a;
    }
}

public class Sort_Array_By_Parity_II {
    public static void main(String[] args) {

    }
}

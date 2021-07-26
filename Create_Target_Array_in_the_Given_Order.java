import java.util.ArrayList;

class Solution {
    public int[] createTargetArray(int[] nums, int[] index) {
        ArrayList<Integer> l1 = new ArrayList<Integer>();

        for (int i = 0; i < nums.length; i++)
            l1.add(index[i], nums[i]);

        int a[] = new int[l1.size()];

        for (int i = 0; i < l1.size(); i++)
            a[i] = l1.get(i);
        return a;
    }
}

public class Create_Target_Array_in_the_Given_Order {

    public static void main(String[] args) {

    }
}

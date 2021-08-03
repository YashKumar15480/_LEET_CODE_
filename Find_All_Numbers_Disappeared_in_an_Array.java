import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {

        ArrayList<Integer> l1 = new ArrayList<>();

        boolean[] count = new boolean[nums.length + 1];

        for (int i = 0; i < nums.length; i++)
            count[nums[i]] = true;

        for (int i = 1; i <= nums.length; i++)
            if (count[i] == false)
                l1.add(i);

        return l1;
    }
}

public class Find_All_Numbers_Disappeared_in_an_Array {
    public static void main(String[] args) {

    }
}

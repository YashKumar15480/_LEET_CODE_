import java.util.HashMap;
import java.util.Map;

class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {

        Map<Integer, Integer> mp = new HashMap<Integer, Integer>();
        for (int i = 0; i < nums.length; i++) {
            if (mp.containsKey(nums[i])) {
                if (i - mp.get(nums[i]) <= k)
                    return true;
                else
                    mp.put(nums[i], i);
            } else
                mp.put(nums[i], i);
        }
        return false;
    }
}

public class Contains_Duplicate_II {
    public static void main(String[] args) {

    }

}

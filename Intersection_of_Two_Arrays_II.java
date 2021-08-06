import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

class Solution {

    public int[] intersect(int[] nums1, int[] nums2) {

        int[] smaller = (nums1.length >= nums2.length) ? nums2 : nums1;
        int[] greater = (nums1.length >= nums2.length) ? nums1 : nums2;

        HashMap<Integer, Integer> map = new HashMap<>();
        for (int n : smaller) {
            if (map.containsKey(n)) {
                map.put(n, map.get(n) + 1);
            } else {
                map.put(n, 1);
            }
        }

        List<Integer> intersection = new ArrayList<>();
        for (int n : greater) {
            if (map.containsKey(n) && map.get(n) > 0) {
                intersection.add(n);
                map.put(n, map.get(n) - 1);
            }
        }

        int[] result = new int[intersection.size()];
        int idx = 0;
        for (int i : intersection) {
            result[idx++] = i;
        }
        return result;
    }
}

public class Intersection_of_Two_Arrays_II {
    public static void main(String[] args) {

    }
}

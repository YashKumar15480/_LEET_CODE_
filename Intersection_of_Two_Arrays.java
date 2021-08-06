import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.Set;

class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {

        // Arrays.sort(nums1);
        // Arrays.sort(nums2);

        int size1 = nums1.length;
        int size2 = nums2.length;

        ArrayList<Integer> l1 = new ArrayList<>();

        for (int i = 0; i < size1; i++) {
            for (int j = 0; j < size2; j++) {
                if (nums1[i] == nums2[j]) {
                    l1.add(nums1[i]);
                    break;
                }
            }
        }

        Set<Integer> s = new LinkedHashSet<Integer>(l1);

        int a[] = new int[s.size()];

        int y = 0;
        for (int x : s)
            a[y++] = x;

        return a;
    }
}

public class Intersection_of_Two_Arrays {
    public static void main(String[] args) {

    }
}

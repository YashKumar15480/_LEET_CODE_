import java.util.Arrays;

class Solution {
    public int search(int[] nums, int target) {

        return ((Arrays.binarySearch(nums, target)) < 0) ? -1 : (Arrays.binarySearch(nums, target));

    }
}

public class Binary_Search {
    public static void main(String[] args) {

    }
}

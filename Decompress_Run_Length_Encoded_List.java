import java.util.Arrays;

class Solution {
    public int[] decompressRLElist(int[] nums) {
        int arrSize = 0;
        for (int i = 0; i < nums.length; i += 2) {
            arrSize += nums[i];
        }

        int[] result = new int[arrSize];

        int startIndex = 0;
        for (int i = 0; i < nums.length; i += 2) {
            Arrays.fill(result, startIndex, startIndex + nums[i], nums[i + 1]);
            startIndex += nums[i];
        }
        return result;
    }
}

public class Decompress_Run_Length_Encoded_List {
    public static void main(String[] args) {

    }

}

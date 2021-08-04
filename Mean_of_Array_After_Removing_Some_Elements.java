import java.util.Arrays;

class Solution {
    public double trimMean(int[] arr) {
        Arrays.sort(arr);
        int removeCount = arr.length / 20;

        int sum = 0;
        for (int i = removeCount; i < arr.length - removeCount; i++)
            sum += arr[i];

        return sum / (double) (arr.length - 2 * removeCount);
    }
}

public class Mean_of_Array_After_Removing_Some_Elements {
    public static void main(String[] args) {

    }

}

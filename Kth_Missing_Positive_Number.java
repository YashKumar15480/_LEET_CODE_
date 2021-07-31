class Solution {
    public int findKthPositive(int[] arr, int k) {
        if (arr[0] > k)
            return k;

        int n = k, count = 0;

        for (int i : arr) {
            if (i <= n)
                n++;
            else
                break;
        }
        return n;
    }
}

public class Kth_Missing_Positive_Number {
    public static void main(String[] args) {

    }
}

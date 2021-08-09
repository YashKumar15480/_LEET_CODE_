class Solution {
    public void duplicateZeros(int[] arr) {

        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] == 0) {
                int k = i + 1;
                int end = arr.length - 1;

                while (end >= k) {
                    arr[end] = arr[end - 1];
                    end--;
                }

                arr[i + 1] = 0;
                i++;
            }
        }
    }
}

public class Duplicate_Zeros {
    public static void main(String[] args) {

    }

}

class Solution {
    public int findSpecialInteger(int[] arr) {

        int after = arr.length / 4;

        for (int i = 0; after < arr.length; i++) {
            if (arr[i] == arr[after])
                return arr[i];
            after++;
        }

        return -1;
    }
}

public class Element_Appearing_More_Than_25_Percent_In_Sorted_Array {
    public static void main(String[] args) {

    }
}

class Solution {
    public int[] decode(int[] encoded, int first) {

        int[] a = new int[encoded.length + 1];
        a[0] = first;
        int k = 0;
        for (int i : encoded) {
            a[k + 1] = i ^ a[k];
            k++;
        }
        return (a);

    }
}

public class Decode_XORed_Array {
    public static void main(String[] args) {

    }

}

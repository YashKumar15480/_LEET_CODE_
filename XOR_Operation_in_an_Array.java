class Solution {
    public int xorOperation(int n, int start) {
        int sum = 0;

        for (int i = 0; i < n; i++)
            sum ^= (start + 2 * i);
        return sum;
    }
}

public class XOR_Operation_in_an_Array {
    public static void main(String[] args) {
        {
        }
    }

}

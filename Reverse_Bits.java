class Solution {

    public int reverseBits(int n) {
        int ans = 0;
        for (int i = 0; i < 32; i++) {
            ans = ans << 1;
            if ((n & 1) == 1)
                ans++;
            n = n >>> 1;
        }
        return ans;
    }
}

public class Reverse_Bits {
    public static void main(String[] args) {

    }
}

class Solution {

    public char slowestKey(int[] rT, String SSS) {
        int prev = 0;
        int max = 0;
        char ch = 'a';
        for (int i = 0; i < rT.length; i++) {
            if (rT[i] - prev > max) {
                max = rT[i] - prev;
                ch = SSS.charAt(i);
            } else if (rT[i] - prev == max) {
                max = rT[i] - prev;

                if ((int) ch < SSS.charAt(i)) {
                    ch = SSS.charAt(i);
                }
            }
            prev = rT[i];
        }

        return ch;
    }
}

public class Slowest_Key {
    public static void main(String[] args) {

    }
}
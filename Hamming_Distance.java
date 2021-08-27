class Solution {
    public int hammingDistance(int x, int y) {
        int count = 0;

        while (x != 0 || y != 0) {
            boolean a = 1 == (1 & x);
            boolean b = 1 == (1 & y);
            if (a != b)
                count++;
            x = x >> 1;
            y = y >> 1;
        }
        return count;
    }
}

public class Hamming_Distance {
    public static void main(String[] args) {

    }

}

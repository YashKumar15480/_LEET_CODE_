class Solution {
    public int climbStairs(int n) {

        if (n == 1 || n == 2)
            return n;

        int a = 1;
        int b = 2;

        for (int i = 3; i <= n; i++) {
            b = a + b;
            a = Math.abs(a - b);
        }
        return b;
//
    }
}

public class Climbing_Stairs {
    public static void main(String[] args) {

    }

}

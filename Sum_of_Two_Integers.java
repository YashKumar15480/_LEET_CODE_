class Solution {
    public int getSum(int a, int b) {

        while (b != 0) {
            int c = a & b;
            a = a ^ b;
            b = c << 1;
        }
        return a;

    }
}

public class Sum_of_Two_Integers {
    public static void main(String[] args) {

    }

}

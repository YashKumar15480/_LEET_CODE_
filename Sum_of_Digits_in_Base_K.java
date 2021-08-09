class Solution {
    public int sumBase(int n, int k) {

        int rem = 0, sum = 0;
        String s = Integer.toString(n, k);
        n = Integer.valueOf(s);

        while (n > 0) {
            rem = n % 10;
            sum = sum + rem;
            n = n / 10;
        }

        return sum;
    }
}

public class Sum_of_Digits_in_Base_K {
    public static void main(String[] args) {

    }
}

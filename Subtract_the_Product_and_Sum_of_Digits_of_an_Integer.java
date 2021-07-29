class Solution {
    public int subtractProductAndSum(int n) {
        int sum = 0, diff = 1;
        int re1 = 0;
        while (n > 0) {
            re1 = n % 10;
            sum += re1;
            diff *= re1;
            n /= 10;
        }
        return diff - sum;
    }
}

public class Subtract_the_Product_and_Sum_of_Digits_of_an_Integer {
    public static void main(String[] args) {

    }

}

class Solution {
    public int numberOfMatches(int n) {
        int sum = 0;

        while (n > 1) {
            if (n % 2 == 0) {
                sum += n / 2;
                n /= 2;
            }
            if (n % 2 != 0) {
                sum += (n - 1) / 2;
                n = (n - 1) / 2 + 1;
            }

        }
        return sum;
    }
}

public class Count_of_Matches_in_Tournament {
    public static void main(String[] args) {

    }
}

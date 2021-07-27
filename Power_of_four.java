class Solution {
    public boolean isPowerOfFour(int n) {
        for (int i = 0; i < 31; i++)

            if (Math.pow(4, i) == n)
                return true;

        return false;

    }
}

public class Power_of_four {
    public static void main(String[] args) {

    }

}

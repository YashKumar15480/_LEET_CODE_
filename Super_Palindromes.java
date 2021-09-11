class Solution {
    public int superpalindromesInRange(String left, String right) {
        long l = Long.parseLong(left), r = Long.parseLong(right);
        int cnt = 0;
        long cur = 1;
        while (true) {
            long p1 = getPalindromeIncLastDigit(cur);
            long p2 = getPalindromeExcLastDigit(cur);
            long sq1 = p1 * p1;
            long sq2 = p2 * p2;
            if (sq2 > r)
                break;
            if (sq1 >= l && sq1 <= r && isPalindrome(sq1))
                cnt++;
            if (sq2 >= l && isPalindrome(sq2))
                cnt++;
            cur++;
        }
        return cnt;
    }

    private boolean isPalindrome(long x) {
        String s = String.valueOf(x);
        StringBuffer sb = new StringBuffer(s);
        String b = sb.reverse().toString();

        if (s.equals(b))
            return true;
        else
            return false;
    }

    private long getPalindromeIncLastDigit(long val) {
        long copy = val;
        while (copy != 0) {
            val = val * 10 + copy % 10;
            copy /= 10;
        }
        return val;
    }

    private long getPalindromeExcLastDigit(long val) {
        long copy = val / 10;
        while (copy != 0) {
            val = val * 10 + copy % 10;
            copy /= 10;
        }
        return val;
    }
}

public class Super_Palindromes {
    public static void main(String[] args) {

    }

}

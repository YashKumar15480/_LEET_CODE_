class Solution {
    public String truncateSentence(String s, int k) {
        int i = 0;
        while (k > 0 && i < s.length()) {
            if (s.charAt(i++) == ' ') {
                k--;
            }
        }
        if (k != 0)
            return s;
        return s.substring(0, i - 1);
    }
}

/**
 * Truncate_Sentence
 */
public class Truncate_Sentence {

    public static void main(String[] args) {

    }
}
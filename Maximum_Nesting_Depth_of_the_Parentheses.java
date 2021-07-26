class Solution {
    public int maxDepth(String s) {
        int a = 0, b = 0;
        for (char c : s.toCharArray()) {
            if (c == '(')
                a++;
            else if (c == ')')
                a--;

            b = Math.max(a, b);
        }

        return b;
    }
}

/**
 * new
 */
public class Maximum_Nesting_Depth_of_the_Parentheses {
    public static void main(String[] args) {

    }
}
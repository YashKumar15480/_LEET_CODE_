import java.util.Stack;

class Solution {
    public String removeOuterParentheses(String s) {

        Stack st = new Stack();
        char ch[] = s.toCharArray();
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < ch.length; i++) {
            if (ch[i] == '(') {
                st.push('(');
                if (st.size() > 1)
                    sb.append(ch[i]);
            } else {
                if (st.size() > 1)
                    sb.append(ch[i]);
                st.pop();
            }
        }

        return sb.toString();

    }
}

public class Remove_Outermost_Parentheses {
    public static void main(String[] args) {

    }
}
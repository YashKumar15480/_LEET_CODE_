import java.util.HashMap;
import java.util.Stack;

class Solution {
    public boolean isValid(String s) {
        if (s.length() % 2 != 0)
            return false;

        Stack st = new Stack<>();
        HashMap<Character, Character> hp = new HashMap<>();

        hp.put('(', ')');
        hp.put('{', '}');
        hp.put('[', ']');

        for (int i = 0; i < s.length(); i++) {
            if (hp.containsKey(s.charAt(i)))
                st.push(s.charAt(i));
            else if (st.empty())
                return false;
            else if (hp.get(st.pop()) != s.charAt(i))
                return false;
        }
        if (!st.empty())
            return false;
        else
            return true;
    }
}

public class Valid_Parentheses {
    public static void main(String[] args) {
        ////
    }
}
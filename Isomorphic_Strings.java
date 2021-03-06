import java.util.HashMap;
import java.util.Map;

class Solution {
    public boolean isIsomorphic(String s, String t) {
        Map<Character, Character> map = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            char a = s.charAt(i);
            char b = t.charAt(i);

            if (map.containsKey(b) && map.get(b) != a)
                return false;
            if (!map.containsKey(b)) {
                if (map.containsValue(a))
                    return false;
                else
                    map.put(b, a);
            }
        }

        return true;
    }
}

public class Isomorphic_Strings {
    public static void main(String[] args) {

    }

}

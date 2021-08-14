import java.util.HashSet;

class Solution {
    public int firstUniqChar(String s) {

        HashSet<Character> l1 = new HashSet<>();

        for (int i = 0; i < s.length(); i++) {
            if (s.lastIndexOf(s.charAt(i)) == i && !l1.contains(s.charAt(i)))
                return i;
            else
                l1.add(s.charAt(i));
        }
        return -1;
    }
}

public class First_Unique_Character_in_a_String {
    public static void main(String[] args) {

    }
}

class Solution {
    public boolean isAnagram(String s, String t) {

        int n1 = s.length();
        int n2 = t.length();

        if (n1 != n2)
            return false;

        int a[] = new int[26];

        for (int i = 0; i < n1; i++) {

            a[s.charAt(i) - 'a']++;
        }

        for (int i = 0; i < n2; i++) {

            a[t.charAt(i) - 'a'] -= 1;

            if (a[t.charAt(i) - 'a'] < 0)
                return false;
        }

        return true;
    }
}

/**
 * Valid_Anagram
 */
public class Valid_Anagram {

    public static void main(String[] args) {

    }
}
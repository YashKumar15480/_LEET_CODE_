class Solution {
    public boolean halvesAreAlike(String s) {
        int i = 0, j = s.length() / 2;
        int one = 0;
        while (j < s.length()) {
            if (isVowel(s.charAt(i)))
                one++;
            if (isVowel(s.charAt(j)))
                one--;
            i++;
            j++;
        }

        return one == 0;
    }

    public boolean isVowel(char c) {
        return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' || c == 'A' || c == 'E' || c == 'I' || c == 'O'
                || c == 'U';
    }
}

public class Determine_if_String_Halves_Are_Alike {
    public static void main(String[] args) {

    }
}

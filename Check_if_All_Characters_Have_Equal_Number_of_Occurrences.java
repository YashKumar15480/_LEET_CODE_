class Solution {
    public boolean areOccurrencesEqual(String s) {
        int[] freq = new int['z' - 'a' + 1];
        char[] ch = s.toCharArray();
        for (char c : ch)
            freq[c - 'a']++;
        for (int i = 1; i < ch.length; i++)
            if (freq[ch[i] - 'a'] != freq[ch[i - 1] - 'a'])
                return false;
        return true;
    }
}

public class Check_if_All_Characters_Have_Equal_Number_of_Occurrences {
    public static void main(String[] args) {

    }
}
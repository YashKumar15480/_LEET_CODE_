class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        int[] freq = new int[26];

        for (char c : magazine.toCharArray())
            freq[c - 'a']++;

        for (char c : ransomNote.toCharArray())
            freq[c - 'a']--;

        for (int c : freq) {
            if (c < 0)
                return false;
        }
        return true;
    }
}

public class Ransom_Note {
    public static void main(String[] args) {

    }

}

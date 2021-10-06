class Solution {
    public int lengthOfLastWord(String s) {
        int count = 0, length = s.length();
        boolean foundLetter = false;
        for (int i = length - 1; i >= 0; i--) {
            char c = s.charAt(i);
            if (c != ' ') {
                count++;
                foundLetter = true;
            } else {
                if (foundLetter)
                    return count;
            }
        }
        return count;
    }
}

public class Length_of_Last_Word {
    public static void main(String[] args) {
     
    }
}

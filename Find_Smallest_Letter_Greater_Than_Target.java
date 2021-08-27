class Solution {
    public char nextGreatestLetter(char[] letters, char target) {

        for (int i = 0; i < letters.length; i++) {
            if (letters[i] > target)
                return letters[i];
        }

        return letters[0];
    }
}

public class Find_Smallest_Letter_Greater_Than_Target {
    public static void main(String[] args) {

    }
}

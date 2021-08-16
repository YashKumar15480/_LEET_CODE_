class Solution {
    public int numOfStrings(String[] patterns, String word) {

        int count = 0;
        for (int i = 0; i < patterns.length; i++) {
            if (word.contains(patterns[i]))
                count++;
        }

        return count;
    }
}

public class Number_of_Strings_That_Appear_as_Substrings_in_Word {
    public static void main(String[] args) {

    }
}

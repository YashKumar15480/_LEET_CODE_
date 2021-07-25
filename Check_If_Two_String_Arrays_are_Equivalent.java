class Solution {
    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {

        String s1 = "\0";
        String s2 = "\0";

        int size1 = word1.length;
        int size2 = word2.length;

        for (int i = 0; i < size1; i++) {
            s1 = s1.concat(word1[i]);
        }
        for (int i = 0; i < size2; i++) {
            s2 = s2.concat(word2[i]);
        }

        if (s1.equals(s2))
            return true;

        else
            return false;
    }
}

/**
 * Check_If_Two_String_Arrays_are_Equivalent
 */
public class Check_If_Two_String_Arrays_are_Equivalent {

    public static void main(String[] args) {

    }
}
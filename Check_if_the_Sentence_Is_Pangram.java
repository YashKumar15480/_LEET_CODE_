class Solution {
    public boolean checkIfPangram(String sentence) {
        String abc = "abcdefghijklmnopqrstuvwxyz";

        for (int i = 0; i < abc.length(); i++) {
            String a = String.valueOf(abc.charAt(i));
            if (!sentence.contains(a))
                return false;
        }

        return true;
    }
}

public class Check_if_the_Sentence_Is_Pangram {
    public static void main(String[] args) {

    }
}

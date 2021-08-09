class Solution {
    public boolean isSumEqual(String firstWord, String secondWord, String targetWord) {
        String first = "";
        for (int i = 0; i < firstWord.length(); i++) {
            char ch = firstWord.charAt(i);
            int index = (int) (ch - 'a');

            first += Integer.toString(index);
        }
        String second = "";
        for (int i = 0; i < secondWord.length(); i++) {
            char ch = secondWord.charAt(i);
            int index = (int) (ch - 'a');

            second += Integer.toString(index);
        }
        String target = "";
        for (int i = 0; i < targetWord.length(); i++) {
            char ch = targetWord.charAt(i);
            int index = (int) (ch - 'a');

            target += Integer.toString(index);
        }

        return Integer.parseInt(first) + Integer.parseInt(second) == Integer.parseInt(target);

    }
}

public class Check_if_Word_Equals_Summation_of_Two_Words {
    public static void main(String[] args) {

    }
}

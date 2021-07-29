class Solution {
    public int isPrefixOfWord(String sentence, String searchWord) {

        String s[] = sentence.split(" ");

        int size = searchWord.length();
        int i = 1;

        for (String str : s) {
            int size2 = str.length();
            if (size2 >= size) {
                if (searchWord.equals(str.substring(0, size))) {
                    return i;
                }
            }
            i++;
        }
        return -1;

    }
}

public class Check_If_a_Word_Occurs_As_a_Prefix_of_Any_Word_in_a_Sentence {
    public static void main(String[] args) {

    }

}

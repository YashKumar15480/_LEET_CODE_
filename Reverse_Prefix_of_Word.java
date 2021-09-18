class Solution {
    public String reversePrefix(String word, char find) {

        char ch[] = word.toCharArray();

        int k = 0;

        for (int i = 0; i < word.length(); i++) {
            if (ch[i] == find) {
                k = i;
                break;
            }
        }

        StringBuilder sb = new StringBuilder();

        for (int i = k; i >= 0; i--) {
            sb.append(ch[i]);
        }

        for (int i = k + 1; i < word.length(); i++) {
            sb.append(ch[i]);
        }

        //
        return sb.toString();

    }
}

public class Reverse_Prefix_of_Word {
    public static void main(String[] args) {

    }
}
class Solution {
    public String replaceDigits(String s) {

        char c[] = s.toCharArray();

        for (int i = 1; i < s.length(); i += 2) {
            c[i] += c[i - 1] - '0';
        }

        return String.valueOf(c);
    }
}

public class Replace_All_Digits_with_Characters {
    public static void main(String[] args) {

    }

}

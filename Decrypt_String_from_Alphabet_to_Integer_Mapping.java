class Solution {
    public String freqAlphabets(String s) {

        StringBuilder s1 = new StringBuilder();
        String temp = "";

        for (int i = s.length() - 1; i >= 0; i--) {
            temp = "";
            if (s.charAt(i) != '#') {
                char c = (char) (Integer.parseInt(String.valueOf(s.charAt(i))) + 96);
                s1.append(c);
            } else {

                temp = s.charAt(i - 2) + "";
                temp = temp + s.charAt(i - 1);
                char c1 = (char) (Integer.parseInt(String.valueOf(temp)) + 96);
                s1.append(c1);
                i -= 2;
            }
        }

        return s1.reverse().toString();

    }
}

public class Decrypt_String_from_Alphabet_to_Integer_Mapping {

    public static void main(String[] args) {

    }
}
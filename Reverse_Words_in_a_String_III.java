class Solution {
    public String reverseWords(String s) {
        String a[] = s.split(" ");

        StringBuffer rev = new StringBuffer();

        for (int i = 0; i < a.length; i++)
            rev.append(new StringBuffer(a[i]).reverse() + " ");

        return rev.toString().trim();
    }
}

public class Reverse_Words_in_a_String_III {
    public static void main(String[] args) {

    }
}
class Solution {
    public String reverseStr(String s, int k) {
        StringBuffer result = new StringBuffer();
        for (int i = 0; i < s.length() / k + 1; i++) {

            int maxIndex = Math.min(i * k + k, s.length());

            if (i % 2 == 0) {
                result.append(new StringBuffer(s.substring(i * k, maxIndex)).reverse());
            } else {
                result.append(s.substring(i * k, maxIndex));
            }

        }
        return result.toString();
        // yash

    }
}

public class Reverse_String_II {
    public static void main(String[] args) {

    }

}
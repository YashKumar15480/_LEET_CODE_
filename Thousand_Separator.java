class Solution {
    public String thousandSeparator(int n) {

        int count = 0;
        StringBuilder sb = new StringBuilder(String.valueOf(n));
        sb = sb.reverse();
        StringBuilder returnSb = new StringBuilder();

        for (int i = 0; i < sb.length(); i++) {
            returnSb.append(sb.charAt(i));
            count++;
            if (count == 3) {
                if (i + 1 < sb.length()) {
                    returnSb.append('.');
                    count = 0;
                    continue;
                } else
                    return returnSb.reverse().toString();

            }
        }
        return returnSb.reverse().toString();

    }
}

public class Thousand_Separator {
    public static void main(String[] args) {

    }
}
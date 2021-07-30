class Solution {
    public int titleToNumber(String columnTitle) {

        int size = columnTitle.length();

        int count = 0, n = 0;

        for (int i = size - 1; i >= 0; i--) {
            n += Math.pow(26, count) * (columnTitle.charAt(i) - 65 + 1);
            count++;
        }
        return n;
    }
}

public class Excel_Sheet_Column_Number {
    public static void main(String[] args) {

    }

}

class Solution {
    public int maximum69Number(int num) {

        String s = Integer.toString(num);

        int n = s.indexOf('6');
        if (n == -1) {
            return num;
        }
        num = num + (3 * (int) Math.pow(10, s.length() - n - 1));
        return num;
    }
}

public class Maximum_69_Number {
    public static void main(String[] args) {

    }

}

class Solution {
    public int getLucky(String s, int k) {
        int number = 0;
        int sum = 0;

        for (char c : s.toCharArray()) {
            number = c - 'a' + 1;
            sum += number / 10 + number % 10;
        }

        while (--k > 0) {
            number = sum;
            sum = 0;
            for (; number > 0; number /= 10)
                sum += number % 10;
        }

        return sum;
    }
}

public class Sum_of_Digits_of_String_After_Convert {
    public static void main(String[] args) {

    }

}

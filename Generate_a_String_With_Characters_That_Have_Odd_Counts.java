class Solution {
    public String generateTheString(int n) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n - 1; i++) {
            sb.append('a');
        }
        if (n % 2 == 1) {
            sb.append('y');
        } else {
            sb.append('k');
        }
        return sb.toString();
    }
}

public class Generate_a_String_With_Characters_That_Have_Odd_Counts {
    public static void main(String[] args) {

    }
}

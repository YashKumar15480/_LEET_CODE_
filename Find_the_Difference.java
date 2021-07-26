import java.util.Arrays;

class Solution {
    public char findTheDifference(String s, String t) {
        char a[] = s.toCharArray();
        char b[] = t.toCharArray();

        Arrays.sort(a);
        Arrays.sort(b);

        for (int i = 0; i < a.length; i++)
            if (a[i] != b[i])
                return b[i];

        int size = b.length;
        return b[size - 1];
    }
}

public class Find_the_Difference {
    public static void main(String[] args) {

    }
}

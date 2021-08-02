import java.util.Arrays;

class Solution {
    public int findContentChildren(int[] g, int[] s) {

        int size1 = g.length;
        int size2 = s.length;
        int count = 0, i = 0, j = 0;

        Arrays.sort(g);
        Arrays.sort(s);

        while (i < size1 && j < size2) {

            if (s[j] < g[i])
                j++;
            else {
                i++;
                j++;
                count++;
            }
        }

        return count;
    }
}

public class Assign_Cookies {
    public static void main(String[] args) {

    }
}

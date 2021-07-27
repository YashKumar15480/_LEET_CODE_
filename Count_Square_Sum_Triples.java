class Solution {
    public int countTriples(int n) {

        int a = 0, b = 0, c = 0, temp = 0, sum = 0;

        for (a = 1; a < n; a++) {
            for (b = a + 1; b < n; b++) {
                temp = a * a + b * b;
                c = (int) Math.sqrt(temp);
                if (c * c == temp && c <= n)
                    sum += 2;
            }
        }
        return sum;

    }
}

public class Count_Square_Sum_Triples {
    public static void main(String[] args) {

    }

}

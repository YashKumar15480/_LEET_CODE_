class Solution {
    public int oddCells(int m, int n, int[][] indices) {

        int a[][] = new int[m][n];

        for (int i = 0; i < m; i++)
            for (int j = 0; j < n; j++)
                a[i][j] = 0;

        for (int i = 0; i < indices.length; i++) {
            int m1 = indices[i][0];
            int m2 = indices[i][1];

            for (int j = 0; j < n; j++)
                a[m1][j]++;

            for (int j = 0; j < m; j++)
                a[j][m2]++;

        }

        int count = 0;

        for (int i = 0; i < m; i++)
            for (int j = 0; j < n; j++)
                if (a[i][j] % 2 != 0)
                    count++;

        return count;

    }
}

public class Cells_with_Odd_Values_in_a_Matrix {
    public static void main(String[] args) {

    }
}

class Solution {
    public int diagonalSum(int[][] mat) {

        int size = mat.length;
        int sum1 = 0, sum2 = 0, flag = 0;

        if (size == 1 || size == 0)
            return mat[0][0];
        if (size % 2 != 0)
            flag = 1;

        for (int i = 0; i < size; i++)
            for (int j = 0; j < size; j++)
                if (i == j)
                    sum1 = sum1 + mat[i][j];

        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if (flag == 1) {
                    if (i == j && i + j == (size - 1))
                        continue;
                }
                if (i + j == (size - 1))
                    sum1 = sum1 + mat[i][j];
            }
        }

        return sum1 + sum2;
    }
}

public class Matrix_Diagonal_Sum {
    public static void main(String[] args) {

    }
}

class Solution {
    public int[][] flipAndInvertImage(int[][] image) {

        int row = image.length;
        int col = image[0].length;

        for (int i = 0; i < row; i++) {
            int start = 0;
            int end = col - 1;

            while (start < end) {
                // Swap the element
                int temp = image[i][start];
                image[i][start] = image[i][end];
                image[i][end] = temp;

                // Increment start and decrement
                // end for next pair of swapping

                start++;
                end--;
            }
        }

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if (image[i][j] == 0)
                    image[i][j] += 1;
                else
                    image[i][j] -= 1;
            }
        }

        return image;
    }
}

public class Flipping_an_Image {
    public static void main(String[] args) {

    }

}

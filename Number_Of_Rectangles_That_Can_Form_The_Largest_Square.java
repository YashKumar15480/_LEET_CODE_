import java.util.ArrayList;
import java.util.Collections;

class Solution {
    public int countGoodRectangles(int[][] rectangles) {

        ArrayList<Integer> l1 = new ArrayList<>();

        int row = rectangles.length;
        int col = rectangles[0].length;

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col - 1; j++) {
                if (rectangles[i][j] <= rectangles[i][j + 1])
                    l1.add(rectangles[i][j]);
                else
                    l1.add(rectangles[i][j + 1]);
            }
        }

        int n = Collections.max(l1);
        int count = 0;
        for (int i = 0; i < l1.size(); i++)
            if (n == l1.get(i))
                count++;

        System.out.print(l1);
        return count;
    }
}

public class Number_Of_Rectangles_That_Can_Form_The_Largest_Square {
    public static void main(String[] args) {

    }
}

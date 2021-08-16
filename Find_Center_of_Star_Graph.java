class Solution {
    public int findCenter(int[][] edges) {

        int k1 = edges[0][0];
        int k2 = edges[0][1];
        int count1 = 0, count2 = 0;

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                if (edges[i][j] == k1)
                    count1++;
                if (edges[i][j] == k2)
                    count2++;
            }
        }

        if (count1 > count2)
            return k1;
        else
            return k2;

    }
}

public class Find_Center_of_Star_Graph {
    public static void main(String[] args) {

    }
}

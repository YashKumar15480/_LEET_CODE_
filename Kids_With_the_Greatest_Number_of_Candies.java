import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {

        ArrayList<Boolean> l1 = new ArrayList<>();

        int max = 0;
        for (int i = 0; i < candies.length; i++)
            if (candies[i] >= max)
                max = candies[i];

        for (int i = 0; i < candies.length; i++) {
            if (candies[i] + extraCandies >= max)
                l1.add(true);
            else
                l1.add(false);
        }
        return l1;
    }
}

public class Kids_With_the_Greatest_Number_of_Candies {
    public static void main(String[] args) {

    }
}

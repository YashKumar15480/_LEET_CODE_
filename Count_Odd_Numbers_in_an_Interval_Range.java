class Solution {
    public int countOdds(int low, int high) {
        if (low % 2 != 0)
            low--;
        if (high % 2 != 0)
            high++;
        return (high - low) / 2;
    }
}

public class Count_Odd_Numbers_in_an_Interval_Range {
    public static void main(String[] args) {

    }

}

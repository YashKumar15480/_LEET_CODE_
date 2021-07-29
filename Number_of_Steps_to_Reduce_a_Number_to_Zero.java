class Solution {
    public int numberOfSteps(int num) {
        int count = 0;
        while (num != 0) {
            if (num % 2 == 0)
                num /= 2;
            else
                num -= 1;
            count++;
        }
        return count;
    }
}

public class Number_of_Steps_to_Reduce_a_Number_to_Zero {
    public static void main(String[] args) {

    }
}

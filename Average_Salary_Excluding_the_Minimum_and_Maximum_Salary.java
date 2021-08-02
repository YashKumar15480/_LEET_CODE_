import java.util.Arrays;

class Solution {
    public double average(int[] salary) {

        Arrays.sort(salary);
        int sum = 0;
        double div = salary.length - 2;
        for (int i = 1; i < salary.length - 1; i++) {
            sum = sum + salary[i];
        }
        return sum / div;
    }
}

public class Average_Salary_Excluding_the_Minimum_and_Maximum_Salary {
    public static void main(String[] args) {

    }

}

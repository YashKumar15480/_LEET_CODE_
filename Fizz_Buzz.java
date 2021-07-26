import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<String> fizzBuzz(int n) {

        ArrayList<String> l1 = new ArrayList<String>();

        for (int i = 1; i <= n; i++) {
            if (i % 5 == 0 && i % 3 == 0)
                l1.add("FizzBuzz");
            else if (i % 3 == 0)
                l1.add("Fizz");
            else if (i % 5 == 0)
                l1.add("Buzz");
            else
                l1.add(Integer.toString(i));

        }

        return l1;
    }
}

public class Fizz_Buzz {
    public static void main(String[] args) {

    }
}

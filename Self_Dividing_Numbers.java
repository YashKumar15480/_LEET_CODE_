import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<Integer> selfDividingNumbers(int left, int right) {
        ArrayList<Integer> l1 = new ArrayList<Integer>();

        for (int i = left; i <= right; i++)
            if (Number(i))
                l1.add(i);

        return l1;
    }

    private boolean Number(int n) {
        int temp = n;
        while (temp > 0) {
            int d = temp % 10;
            if (d == 0 || n % d != 0)
                return false;
            temp /= 10;
        }

        return true;
    }
}

public class Self_Dividing_Numbers {
    public static void main(String[] args) {

    }

}

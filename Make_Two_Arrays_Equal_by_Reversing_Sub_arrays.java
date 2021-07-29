import java.util.Arrays;

class Solution {
    public boolean canBeEqual(int[] target, int[] arr) {

        int size1 = target.length;
        int size2 = arr.length;

        if (size1 == size2) {
            Arrays.sort(arr);
            Arrays.sort(target);

            for (int i = 0; i < size1; i++) {
                if (target[i] != arr[i])
                    return false;
            }
            return true;
        } else
            return false;

    }
}

public class Make_Two_Arrays_Equal_by_Reversing_Sub_arrays {
    public static void main(String[] args) {

    }
}

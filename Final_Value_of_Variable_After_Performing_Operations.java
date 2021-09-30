class Solution {
    public int finalValueAfterOperations(String[] a) {
        int x = 0;

        for (int i = 0; i < a.length; i++) {
            if (a[i].equals("X++") || a[i].equals("++X"))
                x++;
            else
                x--;

        }

        return x;
    }
}

public class Final_Value_of_Variable_After_Performing_Operations {
    public static void main(String[] args) {

    }
}

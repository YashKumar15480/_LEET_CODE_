class Solution {
    public int[] countBits(int n) {

        ArrayList<String> l1 = new ArrayList<>();

        for (int i = 0; i <= n; i++) {
            String s = Integer.toBinaryString(i);
            l1.add(s);
        }

        int a[] = new int[l1.size()];

        for (int i = 0; i < l1.size(); i++) {
            String s = l1.get(i);
            int count = 0;
            for (int j = 0; j < s.length(); j++) {
                if (s.charAt(j) == '1')
                    count++;
            }
            a[i] = count;
        }

        return a;// k

    }
}

public class Counting_Bits {
    public static void main(String[] args) {

    }
}

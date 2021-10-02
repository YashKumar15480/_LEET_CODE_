class Solution {
    public int[] diStringMatch(String s) {

        int arr[] = new int[s.length() + 1];

        int count1 = 0;
        int count2 = s.length();

        for (int i = 0; i < arr.length; i++) {
            if (i == s.length()) {
                arr[i] = count1;
                return arr;
            }

            if (s.charAt(i) == 'I')
                arr[i] = count1++;
            else
                arr[i] = count2--;

        }
        return arr;
    }
}

public class DI_String_Match {
    public static void maine(String args[]) {

    }
}
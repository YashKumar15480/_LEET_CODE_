class Solution {
    public int countConsistentStrings(String allowed, String[] words) {
        int count = 0;
        int size = words.length;
        for (int i = 0; i < size; i++) {
            String w = words[i];
            boolean flag = true;

            for (int j = 0; j < w.length(); j++) {
                if (!allowed.contains(String.valueOf(w.charAt(j)))) {
                    flag = false;
                    break;
                }
            }
            if (flag) {
                count++;
            }
        }
        return count;
    }
}

public class Count_the_Number_of_Consistent_Strings {
    public static void main(String[] args) {

    }

}

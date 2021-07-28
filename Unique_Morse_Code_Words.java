import java.util.ArrayList;
import java.util.List;

class Solution {
    public int uniqueMorseRepresentations(String[] words) {
        String a[] = { ".-", "-...", "-.-.", "-..", ".", "..-.", "--.", "....", "..", ".---", "-.-", ".-..", "--", "-.",
                "---", ".--.", "--.-", ".-.", "...", "-", "..-", "...-", ".--", "-..-", "-.--", "--.." };

        int i = 0;
        List<String> s1 = new ArrayList<>();
        while (i < words.length) {
            int j = 0;
            StringBuilder ss = new StringBuilder();
            while (j < words[i].length()) {
                ss.append(a[words[i].charAt(j) - 'a']);
                j++;
            }
            if (!s1.contains(ss.toString()) && !ss.toString().equals("")) {
                s1.add(ss.toString());
            }
            i++;
        }
        return s1.size();
    }
}

public class Unique_Morse_Code_Words {
    public static void main(String[] args) {

    }
}

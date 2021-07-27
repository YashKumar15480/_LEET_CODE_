import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

class Solution {
    public String[] findWords(String[] words) {
        String row1 = "qwertyuiop";
        String row2 = "asdfghjkl";
        String row3 = "zxcvbnm";

        ArrayList<String> finalArr = new ArrayList<>();
        boolean flag = true;
        for (int i = 0; i < words.length; i++) {
            if (containss(words[i].toLowerCase(), row1) || containss(words[i].toLowerCase(), row2)
                    || containss(words[i].toLowerCase(), row3)) {
                finalArr.add(words[i]);
            }
        }
        String[] retArr = new String[finalArr.size()];
        for (int i = 0; i < finalArr.size(); i++) {
            retArr[i] = finalArr.get(i);
        }
        return retArr;
    }

    private static boolean containss(String word, String row) {
        for (int k = 0; k < word.length(); k++) {
            if (row.indexOf(word.charAt(k)) < 0) {
                return false;
            }
        }
        return true;
    }
}

public class Keyboard_Row {
    public static void main(String[] args) {

    }
}

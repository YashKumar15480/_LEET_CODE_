import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<String> stringMatching(String[] words) {
        int size = words.length;
        ArrayList<String> l1 = new ArrayList<String>();
        for (int i = 0; i < size; i++) {
            String s = words[i];
            for (int j = 0; j < size; j++) {
                if (i != j)
                    if (words[j].contains(s)) {
                        l1.add(words[i]);
                        break;
                    }
            }
        }

        return l1;
    }
}

public class String_Matching_in_an_Array {
    public static void main(String[] args) {

    }
}
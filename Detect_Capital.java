class Solution {
    public boolean detectCapitalUse(String word) {

        if (word == null)
            return false;
        else if (word.equals(word.toUpperCase()))
            return true;
        else if (word.equals(word.toLowerCase()))
            return true;
        else if (word.equals(word.substring(0, 1).toUpperCase() + word.substring(1).toLowerCase()))
            return true;
        return false;
    }

}

public class Detect_Capital {

    public static void main(String[] args) {

    }
}

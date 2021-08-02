class Solution {
    public String convertToTitle(int columnNumber) {
        StringBuilder sb = new StringBuilder();
        while (columnNumber > 0) {
            sb.append((char) ((--columnNumber) % 26 + 65));
            columnNumber /= 26;
        }
        return sb.reverse().toString();
    }
}

public class Excel_Sheet_Column_Title {
    public static void main(String[] args) {

    }

}

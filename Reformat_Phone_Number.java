class Solution {
    public String reformatNumber(String number) {

        number = number.replace("-", "").replace(" ", "");

        return re(number);
    }

    public String re(String number) {
        int size = number.length();

        switch (size) {
            case 0, 1, 2, 3:
                return number;
            case 4:
                return number.substring(0, 2) + "-" + number.substring(2);
            default:
                return number.substring(0, 3) + "-" + re(number.substring(3));
        }
    }
}

public class Reformat_Phone_Number {
    public static void main(String[] args) {

    }

}

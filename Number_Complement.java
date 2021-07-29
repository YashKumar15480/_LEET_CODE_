class Solution {
    public int findComplement(int num) {
        String binary = Integer.toBinaryString(num);

        char ch[] = new char[binary.length()];

        for (int i = 0; i < binary.length(); i++)
            if (binary.charAt(i) == '1')
                ch[i] = '0';
            else
                ch[i] = '1';

        return Integer.parseInt(String.valueOf(ch), 2);
    }
}

public class Number_Complement {
    public static void main(String[] args) {

    }

}

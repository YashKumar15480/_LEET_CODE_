class Solution {
    public boolean checkRecord(String s) {
        int count1 = 0;

        for (int i = 0; i < s.length() - 2; i++)
            if (s.charAt(i) == 'L' && s.charAt(i + 1) == 'L' && s.charAt(i + 2) == 'L')
                return false;

        for (int i = 0; i < s.length(); i++)
            if (s.charAt(i) == 'A')
                count1++;
        if (count1 >= 2)
            return false;
        else
            return true;

    }
}

public class Student_Attendance_Record_I {
    public static void main(String[] args) {

    }

}

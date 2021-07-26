class Solution {
    public int busyStudent(int[] startTime, int[] endTime, int queryTime) {

        int size = startTime.length;
        int count = 0;
        for (int i = 0; i < size; i++)

            if (startTime[i] <= queryTime && queryTime <= endTime[i])
                count++;

        return count;
    }
}

public class Number_of_Students_Doing_Homework_at_a_Given_Time {
    public static void main(String[] args) {

    }

}

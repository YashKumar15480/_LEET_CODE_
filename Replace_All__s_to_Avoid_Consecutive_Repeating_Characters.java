class Solution {
    public String modifyString(String s) {
        int len = s.length();
        char arr[] = s.toCharArray();

        for (int i = len - 1; i >= 0; i--) {
            char local = 'a';
            if (i < len - 1)
                local = arr[i + 1];
            while (i >= 0 && arr[i] == '?') {
                if (local == 'z')
                    local = 'a';
                arr[i--] = ++local;
            }

            if (local == 'z')
                local = 'a';
            if (i >= 0 && i < len - 1 && arr[i] == arr[i + 1])
                arr[i + 1] = ++local;
        }

        return new String(arr);
    }

}

public class Replace_All_?_s_to_Avoid_Consecutive_Repeating_Characters
{

    public static void main(String[] args) {

    }

}

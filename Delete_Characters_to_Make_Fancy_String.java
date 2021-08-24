class Solution {
    public String makeFancyString(String s) {

        char a[] = s.toCharArray();

        for (int i = 0; i < a.length - 2; i++) {
            if (a[i] == a[i + 1] && a[i + 1] == a[i + 2])
                a[i] = '0';

        }

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < a.length; i++)
            if (a[i] != '0')
                sb.append(a[i]);

        return sb.toString();
    }
}

public class Delete_Characters_to_Make_Fancy_String {
    public static void main(String[] args) {

    }
}

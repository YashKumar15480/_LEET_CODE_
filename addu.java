import java.util.Scanner;

class find {

    static String yy(String s) {

        int count = 0;

        for (int i = 0; i < s.length(); i++) {
            if (count == 7)
                return "YES";

            else if (s.charAt(i) == '1')
                count++;
            else
                count = 0;
        }

        return "NO";
    }

}

public class addu {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        sc.close();

        find b = new find();
        System.out.println(b.yy(s));
    }
}
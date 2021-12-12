import java.util.Scanner;

public class Allu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        int a = sc.nextInt();
        int b = sc.nextInt();

        while (t > 0) {

            String s = sc.next();
            int x = 0, y = 0;
            for (int i = 0; i < s.length(); i++) {
                if (s.charAt(i) == 'L')
                    x--;
                else if (s.charAt(i) == 'R')
                    x++;
                else if (s.charAt(i) == 'D')
                    y--;
                else if (s.charAt(i) == 'U')
                    y++;

            }
            if (a == x || b == y)
                System.out.println("true");
            else
                System.out.println("false");
            t--;
        }

    }
}

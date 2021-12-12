import java.util.Scanner;

public class Allu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        int a = sc.nextInt();
        int b = sc.nextInt();
        int x = 0, y = 0;

        while (t > 0) {

            String s = sc.next();

            for (int i = 0; i < s.length(); i++) {

                switch (s.charAt(i)) {
                    case 'L':
                        x = x - 1;
                        break;
                    case 'R':
                        x = x + 1;
                        break;
                    case 'D':
                        y = y - 1;
                        break;
                    case 'U':
                        y = y + 1;
                        break;
                }

            }

            t--;
        }
        if (a == x && b == y)
            System.out.println("true");
        else
            System.out.println(x + " -- " + y + "||||" + " -- " + a + " --" + b);

    }
}

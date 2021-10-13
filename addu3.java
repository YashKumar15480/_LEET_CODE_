import java.util.ArrayList;
import java.util.Scanner;

public class addu3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int a[] = new int[n];
        for (int i = 0; i < n; i++)
            a[i] = sc.nextInt();

        ArrayList<Long> l1 = new ArrayList<>();

        for (long i = 0; i < 1000000; i++) {
            long sum = i * i * i;

            String s = String.valueOf(sum);
            if (s.length() >= 3) {
                if (s.charAt(s.length() - 1) == '8' && s.charAt(s.length() - 2) == '8'
                        && s.charAt(s.length() - 3) == '8')
                    l1.add(i);
            }
        }

        for (int i = 0; i < n; i++) {
            int n1 = (int) a[i] - 1;
            System.out.println(l1.get(n1));
        }

    }
}

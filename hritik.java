import java.util.Scanner;

class contain {
    static String find(String s1, String s2) {

        if (s1.contains(s2))
            return "YES";
        else
            return "NO";
    }
}

public class hritik {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        String s1 = sc.nextLine();
        String s2 = sc.nextLine();

        contain b = new contain();
        System.out.println(b.find(s1, s2));
    }
}

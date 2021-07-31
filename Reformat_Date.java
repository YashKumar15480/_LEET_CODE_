import java.util.*;

public class Reformat_Date {

    public String reformatDate(String date) {
        if (date == null || date.length() == 0)
            return null;

        StringBuilder sb = new StringBuilder();
        String[] a = date.split(" ");
        sb.append(a[a.length - 1]);
        sb.append("-");

        String months[] = new String[] { "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov",
                "Dec" };

        String month = a[1];

        for (int i = 0; i < months.length; i++) {
            if (month.equals(months[i]) && (i + 1 > 9)) {
                sb.append(i + 1);
                break;
            } else if (month.equals(months[i]) && (i + 1 <= 9)) {
                sb.append("0");
                sb.append(i + 1);
                break;
            } else
                continue;
        }
        sb.append("-");

        String day = a[0].substring(0, a[0].length() - 2);

        if (day.length() == 1) {
            sb.append("0");
            sb.append(day);
        } else
            sb.append(day);

        return sb.toString();
    }

    public static void main(String[] args) {
        Reformat_Date o = new Reformat_Date();
        System.out.print(o.reformatDate("09th May 1960"));
    }
}

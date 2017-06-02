/**
 * Created by book on 29.05.17.
 */
public class DateCalculator {
    public static void main(String[] args) {
        int days = 520;

        int year = days / 360 + 1 ;
        int month = days % 360  / 30 + 1;
        int day = days % 360 % 30 + 1;

        System.out.println("year = " + year);
        System.out.println("month = " + month);
        System.out.println("day = " + day);
    }
}

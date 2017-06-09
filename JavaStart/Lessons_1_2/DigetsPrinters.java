package JavaStart.Lessons_1_2;

/**
 * Created by book on 29.05.17.
 */
public class DigetsPrinters {
    public static void main(String[] args) {
        int nFive = 13569;
        byte nTwo = 24;
        int nNine = 987_654_321;

        System.out.println(nFive / 10000);
        System.out.println(nFive % 10000 / 1000);
        System.out.println(nFive % 1000 / 100);
        System.out.println(nFive % 100 / 10);
        System.out.println(nFive % 10);

        System.out.println("***");

        System.out.println(nTwo / 10000);
        System.out.println(nTwo / 1000);
        System.out.println(nTwo / 100);
        System.out.println(nTwo / 10);
        System.out.println(nTwo % 10);

        System.out.println("***");

        System.out.println(nNine % 100000 / 10000);
        System.out.println(nNine % 10000 / 1000);
        System.out.println(nNine % 1000 / 100);
        System.out.println(nNine % 100 / 10);
        System.out.println(nNine % 10);

    }
}


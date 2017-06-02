/**
 * Created by book on 29.05.17.
 */
public class AverageCalculator {
    public static void main(String[] args) {
        int a = 1_000_000_000;
        int b = 2_000_000_000;
        int avg = (a/2 + b/2 ) + (a%2 + b%2);

        System.out.println("Average = " + avg);
    }
}

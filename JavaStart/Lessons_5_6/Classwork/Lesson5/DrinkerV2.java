package JavaStart.Lessons_5_6.Classwork.Lesson5;
import java.util.Scanner;
/**
 * Created on 010 10.06.17.
 */
public class DrinkerV2 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter quantity bottles: ");
        int beers = s.nextInt();

        System.out.println("I have " + beers + " bottles beers.");
        for (int i = beers-1; i >= 1; i--) {
            System.out.println("I've drunk beer. " + i + " beers left.");
        }
        System.out.println("Wonderful life!");
    }
}

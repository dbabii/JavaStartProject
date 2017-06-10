package JavaStart.Lessons_5_6.Classwork.Lesson5;
import java.util.Scanner;
/**
 * Created on 010 10.06.17.
 */
public class Drinkers {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Eneter quantity drinkers: ");
        int drinkers = s.nextInt();
        System.out.print("Enter quantity beers: ");
        int beers = s.nextInt();

        for (int i = 1; i <= drinkers; i++) {
            System.out.println("I'm drinker #" + i);
            for (int y = 1; y <= beers; y++) {
                System.out.println("I've drunk " + y + " beers");
            }
            System.out.println("Wonderful life!");
        }
    }
}

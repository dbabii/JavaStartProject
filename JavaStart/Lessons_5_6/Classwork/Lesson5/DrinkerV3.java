package JavaStart.Lessons_5_6.Classwork.Lesson5;
import java.util.Scanner;
/**
 * Created on 010 10.06.17.
 */
public class DrinkerV3 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter quantity bottles: ");
        int beers = s.nextInt();

        for (int i = 1; i<=beers; i++) {
            System.out.println("I've drunk " + i + " beers.");
            if (i>5)
                System.out.println("It's so hard.");
        }
    }
}

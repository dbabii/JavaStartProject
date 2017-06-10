package JavaStart.Lessons_5_6.Classwork.Lesson5;
import java.util.Scanner;
/**
 * Created on 010 10.06.17.
 */
public class DrinkerV1 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter quantity: ");
        int beers = s.nextInt();

        for (int i = 1; i<=beers; i++) {
            System.out.println("I've drunk " + i + " beer.");
        }
        System.out.println("Wonderful life!");

    }
}

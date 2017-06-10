package JavaStart.Lessons_3_4.Homework.Lesson_3;
import java.util.Scanner;

/**
 * Created by edu on 005 05.06.17.
 */
public class TaskTwoDifferentRadixSummator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print ("Enter X in Bin: ");
        int x = scanner.nextInt(2);

        System.out.print("Enter Y in Oct: ");
        int y = scanner.nextInt(8);

        System.out.print("Enter Z in Hex: ");
        int z = scanner.nextInt(16);
        scanner.close();

        System.out.println("Amount all values: X + Y + Z = " + (x + y + z));
    }

}

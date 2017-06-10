package JavaStart.Lessons_3_4.Homework.Lesson_4.Cycle;
import java.util.Scanner;

/**
 * Created on 010 10.06.17.
 */
public class PrintNumbersOddFromTo {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter from: ");
        int from = s.nextInt();
        System.out.print("Enter to: ");
        int to = s.nextInt();
        //cycle
        for (int i = from; i <= to; i++)
            if (i % 2 == 0)
                System.out.print(i + " ");
    }
}

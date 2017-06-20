package JavaStart.Lessons_3_4.Homework.Lesson_4.StarOne.Conditions.TryExamples;
import java.util.Scanner;

/**
 * Created by book on 010 10.06.17.
 */
public class PrintNumbersFromToAny {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Print from: ");
        int from = s.nextInt();
        System.out.print("Print to: ");
        int to = s.nextInt();

        //cycle
        if (from > to) {
            System.out.println("From > to: ");

            for (int i = from; i >= to; i--)
                System.out.print(i + " ");
        }
        else {
            System.out.println("From < to");
            for (int i = from; i <= to; i++)
                System.out.print(i + " ");
        }
    }
}

package JavaStart.Lessons_3_4.Homework.Lesson_3;
import java.util.Scanner;

/**
 * Created by edu on 005 05.06.17.
 */
public class TaskFiveAverageCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a: ");
        int a = scanner.nextInt();
        System.out.print("Enter b: ");
        int b = scanner.nextInt();

        scanner.close();

        int avg = (a%2 + b%2) / 2;
        //int avg = (a/2 + b/2) + (a%2 + b%2) /2 ;

        System.out.println(avg);

    }
}

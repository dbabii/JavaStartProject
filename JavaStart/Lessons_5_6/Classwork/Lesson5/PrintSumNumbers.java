package JavaStart.Lessons_5_6.Classwork.Lesson5;
import java.util.Scanner;

/**
 * Created on 010 10.06.17.
 */
public class PrintSumNumbers {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter number from: ");
        int from = s.nextInt();

        System.out.print("Enter number to: ");
        int to = s.nextInt();

        int sum = 0;

        for (int i=from; i<=to; i++){
            sum +=i;
        }

        System.out.println("Sum number from to: " + sum);
    }
}

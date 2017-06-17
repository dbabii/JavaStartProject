package JavaStart.Lessons_3_4.Homework.Lesson_4.StarOne.Conditions;
import java.util.Scanner;

/**
 * Created by book on 010 10.06.17.
 */
public class PrintNumbersFromToFor {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Input number from: ");
        int f = s.nextInt();
        System.out.print("Input number to: ");
        int t = s.nextInt();

        //cycle
        for (int i = f; i<= t; i++){
            System.out.print(" " + i);
        }

    }
}

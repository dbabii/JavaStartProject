package JavaStart.Lessons_3_4.Homework.Lesson_3;
import java.util.Scanner;

/**
 * Created by book on 09.06.17.
 */
public class MinTwoNumbers {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("a = ");
        int a = s.nextInt();
        System.out.print("b = ");
        int b = s.nextInt();

        if (a<b)
            System.out.println("Min = " + a);
        else System.out.println("Min = " + b);
    }

}

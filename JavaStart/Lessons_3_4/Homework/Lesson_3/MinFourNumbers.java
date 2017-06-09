package JavaStart.Lessons_3_4.Homework.Lesson_3;
import java.util.Scanner;
/**
 * Created by book on 09.06.17.
 */
public class MinFourNumbers {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("a = ");
        int a = s.nextInt();
        System.out.print("b = ");
        int b = s.nextInt();
        System.out.print("c = ");
        int c = s.nextInt();
        System.out.print("d = ");
        int d = s.nextInt();

        if ((a<b)&&(b<c)&&(c<d))
            System.out.println("Min = " + a);
        else if ((a>b)&&(b<c)&&(c<d))
            System.out.println("Min = " + b);
        else if ((a>b)&&(b>c)&&(c<d))
            System.out.println("Min = " + c);
        else System.out.println("Min5 = " + d);
    }
}

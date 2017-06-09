package JavaStart.Lessons_3_4.Homework.Lesson_3;
import com.sun.org.apache.xpath.internal.SourceTree;

import java.util.Scanner;
/**
 * Created by book on 09.06.17.
 */
public class MinThreeNumbers {
    public static void main(String[] args) {
        // Input
        Scanner scan = new Scanner(System.in);

        int a, b, c;
        System.out.print("a = ");
        a = scan.nextInt();
        System.out.print("b = ");
        b = scan.nextInt();
        System.out.print("c = " );
        c = scan.nextInt();
        // BL

        if ((a<b)&& (b<c))
            System.out.println("Min = " + a);

        else if ((a>b)&& (b<c))
            System.out.println("Min = " + b);
        else if ((a>b)&& (b>c))
            System.out.println("Min = " + c);

    }
}

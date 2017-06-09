package JavaStart.Lessons_3_4.Homework.Lesson_3;
import java.util.Scanner;

/**
 * Created by book on 09.06.17.
 */
public class NumbersHigh {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("a = ");
        int a = s.nextInt();
        System.out.print("b = ");
        int b = s.nextInt();
        System.out.print("c = ");
        int c = s.nextInt();

        // BL
        if ((a<b)&&(b<c))
            System.out.println("First: " +a + " " + b +" "+ c);
        // not ended, if a=6, b=8, c=1 --> print 2nd
        else if ((a<b)&&(b>c)){
            if (a<c)
                System.out.println("Second one: " + a + " " + c + " " + b);
            else
                System.out.println("Second two: " + c + " " + a + " " + b );
        }

        else if ((c<b) && (b<a))
            System.out.println("Thirdly: " + c + " " + b + " " +  a);
        else System.out.println("Fourtly: " + b + " " + a + " " + c);

    }
}

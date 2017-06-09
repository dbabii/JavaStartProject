package JavaStart.Lessons_3_4.Homework.Lesson_3;
import java.util.Scanner;

/**
 * Created by book on 09.06.17.
 */
public class MinMaxCalc {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter number 1: ");
        int n1 = scan.nextInt();
        System.out.print("Enter number 2: ");
        int n2 = scan.nextInt();

        if (n1 > n2){
            System.out.print("Max = " + n1);
            System.out.println(", Min = " + n2);
            }

            else if (n1 == n2){
            System.out.println("Your numbers equal");
        }

            else {
            System.out.print("Max = " + n2);
            System.out.println(", Min = " + n1);

        }
    }
}

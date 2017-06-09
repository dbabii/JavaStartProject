package JavaStart.Lessons_3_4.Homework.Lesson_3;
import java.util.Scanner;

/**
 * Created by book on 09.06.17.
 */
public class IsAgeChecker {
    public static void main(String[] args) {
        //Input and initiallize scanner
        Scanner scan = new Scanner(System.in);

        System.out.print("Please, input age for checked: ");
        int age = scan.nextInt();

        boolean ageCheck;


        if ((age >= 1) && (age <= 120))
            ageCheck = true;

        else ageCheck = false;

        System.out.println(ageCheck);



    }
}

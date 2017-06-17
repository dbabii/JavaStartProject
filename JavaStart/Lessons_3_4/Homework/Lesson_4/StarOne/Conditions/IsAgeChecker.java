package JavaStart.Lessons_3_4.Homework.Lesson_4.StarOne.Conditions;

import java.util.Scanner;

/**
 * Created on 12.06.17.
 */
public class IsAgeChecker {
    public static boolean ageChecker (int age){
        boolean ageCheck;
        if ((age >= 1) && (age <= 120))
            ageCheck = true;
        else ageCheck = false;
        return ageCheck;
    }



    public static void main(String[] args) {
        //Input and initiallize scanner
        Scanner scan = new Scanner(System.in);

        System.out.print("Please, input age for checked: ");
        int age = scan.nextInt();


        boolean ageCheck = ageChecker(age);
        System.out.println(ageCheck);
    }
}

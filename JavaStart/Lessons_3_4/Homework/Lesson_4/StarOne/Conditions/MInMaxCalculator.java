package JavaStart.Lessons_3_4.Homework.Lesson_4.StarOne.Conditions;

import java.util.Scanner;

/**
 * Created on 12.06.17.
 */
public class MInMaxCalculator {
    public static void minMax (int a, int b){
        if (a<b) {
            System.out.print("min = " + a + " ");
            System.out.println("max = " + b);
        } else {
            System.out.print("min = " + b + " ");
            System.out.println("max = " + a);
        }
        return;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int firstNum = scanner.nextInt();
        System.out.print("Enter second number: ");
        int secondNum = scanner.nextInt();

        minMax(firstNum, secondNum);
    }

}


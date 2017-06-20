package JavaStart.Lessons_3_4.Homework.Lesson_4.StarOne.Conditions;

import java.util.Scanner;

/**
 * Created on 12.06.17.
 */
public class MinMaxCalculator {
    public static int max(int a, int b){
        return a > b ? a : b;
    }

    public static int min (int a, int b){
        return a < b ? a : b;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int firstNum = scanner.nextInt();
        System.out.print("Enter second number: ");
        int secondNum = scanner.nextInt();
        //BL
        System.out.println("Min = " + min(firstNum, secondNum) + ", max = " + max(firstNum, secondNum));
    }

}


package JavaStart.Lessons_3_4.Homework.Lesson_4.StarOne.Loop;

import java.util.Scanner;

/**
 * Created on 12.06.17.
 */
public class EvensRangePrinter {
    public static void printEvensRange (int first, int last){
        if (first < last) {
            for (int i = first; i <= last ; i++) {
                System.out.print(i + " ");
            }
        } else ;
        return;

    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int firstNum = scanner.nextInt();
        System.out.print("Enter second number: ");
        int lastNum = scanner.nextInt();

        printEvensRange (firstNum, lastNum);
    }
}

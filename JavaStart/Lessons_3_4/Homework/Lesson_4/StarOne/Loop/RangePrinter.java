package JavaStart.Lessons_3_4.Homework.Lesson_4.StarOne.Loop;

import java.util.Scanner;

/**
 * Created on 12.06.17.
 */
public class RangePrinter {
    public static void printRange (int first, int last){
        if (first < last) {
            for (int i = first; i <=last ; i++) {
                System.out.print(i + " ");
            }
        } else {
            for (int i = first; i >= last ; i--) {
                System.out.print(i + " ");
            }
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int firstNum = scanner.nextInt();
        System.out.print("Enter last number: ");
        int lastNum = scanner.nextInt();

        printRange(firstNum, lastNum);
    }

}

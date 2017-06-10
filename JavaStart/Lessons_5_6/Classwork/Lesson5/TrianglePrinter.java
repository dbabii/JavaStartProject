package JavaStart.Lessons_5_6.Classwork.Lesson5;

import java.util.Scanner;
/**
 * Created on 010 10.06.17.
 */
public class TrianglePrinter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter size triangle: ");
        int size = scanner.nextInt();

        for (int length = 1; length <= size; length++) {
            //Print line with specified length
            for (int i = 0; i < length; i++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

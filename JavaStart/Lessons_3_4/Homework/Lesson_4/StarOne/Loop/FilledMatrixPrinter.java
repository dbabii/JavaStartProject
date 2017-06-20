package JavaStart.Lessons_3_4.Homework.Lesson_4.StarOne.Loop;

import java.util.Scanner;

/**
 * Created on 020 20.06.17.
 */
public class FilledMatrixPrinter {
    private static void printMatrix(int rows, int cols, int fill) {
        if ((rows > 0) && (cols > 0)) {
            for (int i = 0; i < rows; i++) {
                for (int j = 0; j < cols; j++) {
                    System.out.print(fill + " ");
                }
                System.out.println();
            }
        } else {
            throw new IllegalArgumentException("Rows and Colons should be >0");
        }
    }

    private static int rowsRead() {
        System.out.print("Enter rows: ");
        return new Scanner(System.in).nextInt();
    }

    private static int colsRead (){
        System.out.print("Enter columns: ");
        return new Scanner(System.in).nextInt();
    }

    private static int fillRead (){
        System.out.print("Enter filler: ");
        return new Scanner(System.in).nextInt();
    }

    public static void main(String[] args) {
        printMatrix(rowsRead(), colsRead(), fillRead());
    }
}
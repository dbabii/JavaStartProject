package JavaStart.Lessons_3_4.Homework.Lesson_4.StarOne.Loop;

import java.util.Scanner;

/**
 * Created on 020 20.06.17.
 */
public class RangeWithStepPrinter {
    private static void printRange (int first, int last, int step){
        if ((first < last) && step > 0){
            for (int i = first; i <= last ; i += step) {
                System.out.print(i + " ");
            }
        } else if ((first > last) && step < 0){
            for (int i = first; i >= last ; i += step) {
                System.out.print(i + " ");
            }
        } else if ((((first > last) && step > 0) || ((first < last) && step < 0)) || (step == 0))  {
            throw new IllegalArgumentException("Correct step");
        }
    }

    private  static int firstRead(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input first number: ");
        return scanner.nextInt();
    }

    private static int lastRead (){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input last number: ");
        return scanner.nextInt();
    }

    private static int stepRead (){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter step number: ");
        return scanner.nextInt();
    }

    public static void main(String[] args) {
        int first = firstRead();
        int last = lastRead();
        int step = stepRead();

        // Bl
        printRange(first,last, step);
    }
}

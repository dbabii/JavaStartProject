package JavaStart.Lessons_3_4.Homework.Lesson_4.StarOne.Array;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Created on 12.06.17.
 */
public class ArrayFiller {
    public static void fill (int[] array, int filler) {
        int length = array.length;

        for (int i = 0; i < length; i++) {
            array[i] = filler;
        }
        System.out.println(Arrays.toString(array));
        return;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter size array: ");
        int size  = scanner.nextInt();
        System.out.print("Enter filler: ");
        int fillerIn = scanner.nextInt();

        fill(new int [size], fillerIn);

    }
}

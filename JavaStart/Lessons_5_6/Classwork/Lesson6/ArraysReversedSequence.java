package JavaStart.Lessons_5_6.Classwork.Lesson6;

import java.util.Arrays;

/**
 * Created on 010 10.06.17.
 */
public class ArraysReversedSequence {
    public static void main(String[] args) {
        int[] array = new int[10];

        int length = array.length-1;
//        int length = array.length;
        for (int i = 0; i < length; i++) {
            array[i]=length - i;

//            array[i] = length;
//            length--;
            // array [i] = array.length - 1 - i;

        }

        System.out.println(Arrays.toString(array));
    }
}

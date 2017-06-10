package JavaStart.Lessons_5_6.Classwork.Lesson6;

import java.util.Arrays;

/**
 * Created on 010 10.06.17.
 */
public class ArraySum {
    public static void main(String[] args) {
//        int size = 10;
//        int[] array = new int[size];
          int[] array = {10, 30, 20};
          int sum = 0;
//        int length = array.length;
//
//        for (int i = 0; i < length; i++) {
//            array[i]=i;
//            sum += array [i];

//        }
        // for-each
        for (int elem: array){
            sum += elem;
        }
        System.out.println(Arrays.toString(array));
        System.out.println("sum = " + sum);
    }
}

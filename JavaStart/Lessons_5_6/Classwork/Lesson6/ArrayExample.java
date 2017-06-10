package JavaStart.Lessons_5_6.Classwork.Lesson6;

import java.util.Arrays;

/**
 * Created on 010 10.06.17.
 */
public class ArrayExample {
    public static void main(String[] args) {
//        int x = 10;
        int[] array = new int [10];
        String[] array1 = new String[10];

        int length = array.length;
        System.out.println("length = " + length);

        array [4] = 10;
        array [1] = 1;
        //i = 0..array.length-1


        String s = Arrays.toString(array1);
        System.out.println(s);
        System.out.println(Arrays.toString (array));
    }
}

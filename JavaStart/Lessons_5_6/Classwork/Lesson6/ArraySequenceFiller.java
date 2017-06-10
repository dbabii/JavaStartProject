package JavaStart.Lessons_5_6.Classwork.Lesson6;

import java.util.Arrays;

/**
 * Created on 010 10.06.17.
 */
public class ArraySequenceFiller {
    public static void main(String[] args) {
        int[] array;
// Sequence fiil
//        for (int i = 0; i < array.length; i++) {
//            array[i]=i;

        array = sequenceFill(10);

        //System.out.println(array);
        System.out.println(Arrays.toString(array));
        }


//    Creator
    public static int[] sequenceFill (int size){
        int[] a = new int [size];

        for (int i = 0; i <= a.length; i++) a[i] = i;
        System.out.println(Arrays.toString(a));
        return a;
    }

}

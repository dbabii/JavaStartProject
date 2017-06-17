package JavaStart.Lessons_5_6.Classwork.Lesson6;
import java.util.Scanner;
import java.util.Arrays;

/**
 * Created on 010 10.06.17.
 */
public class ArraySequenceFiller {
    public static void main(String[] args) {
        int[] array;
        System.out.print("Enter size array: ");
        Scanner scanner = new Scanner(System.in);
        int sizeArray = scanner.nextInt();
        array = new int [sizeArray];

// Sequence fiil
//        for (int i = 0; i < array.length; i++) {
//            array[i]=i;

        array = sequenceFill(sizeArray);

        //System.out.println(array);
        System.out.println(Arrays.toString(array));
        }


//    Creator
    public static int[] sequenceFill (int size){
        int[] a = new int [size];
        for (int i = 0; i < size; i++) {
            a[i] = i;

        }
        return a;
    }


}

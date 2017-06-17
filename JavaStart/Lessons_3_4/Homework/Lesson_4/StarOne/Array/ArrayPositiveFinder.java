package JavaStart.Lessons_3_4.Homework.Lesson_4.StarOne.Array;

/**
 * Created on 13.06.17.
 */
public class ArrayPositiveFinder {
    public static int findFirstPositiveElemIndex (int [] arrayFirst){
        for (int i = 0; i < arrayFirst.length; i++) {
            if (arrayFirst[i] > 0) {
                return i;
            }

        }
        return -1;

    }

    public static int findLastPositiveElemIndex (int[] arrayLast){
        for (int i = arrayLast.length -1; i >= 0 ; i--) {
            if (arrayLast[i] > 0) {
                return i;
            }

        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arrayOne = {-3, 19, 1, 4, 5, 9, -8};
        int[] arrayTwo = {-1, -4, -5, -9};
        int[] arrayThree = {3, 4, 5, 9};


        System.out.println(findFirstPositiveElemIndex(arrayOne));
        System.out.println(findFirstPositiveElemIndex(arrayTwo));
        System.out.println(findFirstPositiveElemIndex(arrayThree));
        System.out.println("***");
        System.out.println(findLastPositiveElemIndex(arrayOne));
        System.out.println(findLastPositiveElemIndex(arrayTwo));
        System.out.println(findLastPositiveElemIndex(arrayThree));
    }
}

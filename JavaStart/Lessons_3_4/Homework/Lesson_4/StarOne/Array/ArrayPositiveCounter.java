package JavaStart.Lessons_3_4.Homework.Lesson_4.StarOne.Array;

/**
 * Created on 13.06.17.
 */
public class ArrayPositiveCounter {
    public static int countPositive (int[] arrayCount) {
        int counter = 0;
        for (int i = 0; i < arrayCount.length; i++) {
            if (arrayCount[i] > 0) {
                counter++;
            }
        }
        return counter;
    }

    public static void main(String[] args) {
        int[] arrayOne = {5, 4, 8, -2, -10, 15, 1};
        int[] arrayTWo = {-1, -2, -3, -5, 4, 2};
        int[] arrayThree = {0, 9, -1, -34, 4};

        System.out.println("Count positives numbers in arrayOne = " + countPositive(arrayOne));
        System.out.println("Count positives numbers in arrayTwo = " + countPositive(arrayTWo));
        System.out.println("Count positives numbers in arrayThree = " + countPositive(arrayThree));
    }
}

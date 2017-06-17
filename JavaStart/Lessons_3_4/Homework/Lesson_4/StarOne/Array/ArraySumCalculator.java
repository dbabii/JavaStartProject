package JavaStart.Lessons_3_4.Homework.Lesson_4.StarOne.Array;

/**
 * Created on 12.06.17.
 */
public class ArraySumCalculator {
    public static int sum (int [] arrayMethod) {
        int sum = 0;
        for (int i : arrayMethod) {
            sum += i;
        }
        System.out.println("sum = " + sum);
        return sum;
    }

    public static void main(String[] args) {
        int[] array = {10, 39, 40};
        sum(array);
    }

}


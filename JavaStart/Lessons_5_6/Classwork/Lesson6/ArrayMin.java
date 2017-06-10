package JavaStart.Lessons_5_6.Classwork.Lesson6;

/**
 * Created on 010 10.06.17.
 */
public class ArrayMin {
    public static void main(String[] args) {
        int[] array = {20, 10, 30, 5};

        int min = array [0];

        // / iter + Tab
        for (int elem : array) {
            if (elem < min)
                min = elem;
        }
        System.out.println("min = " + min);
    }
}

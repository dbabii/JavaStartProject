package JavaStart.Lessons_5_6.Classwork.Lesson5;

/**
 * Created on 010 10.06.17.
 */
public class InterestingTrianglePrinter {
    public static void main(String[] args) {

        int size = 5;
        for (int row = 1; row <=size ; row++) {
            for (int j = 1; j <row ; j++) {
                System.out.print(row + " ");
            }
            System.out.println();
        }
    }

}

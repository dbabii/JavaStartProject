package JavaStart.Lessons_3_4.Homework.Lesson_4.StarOne.Array;

/**
 * Created on 14.06.17.
 */
public class MatrixTransponser {
    public static void main(String[] args) {
        System.out.println(transpose(new int[][] {{1, 3, 4, 5}, {9, 8, 6, 5}}));

    }

    public static int[][] transpose (int [][] matrix){
        for (int[] ints : matrix) {
            for (int anInt : ints) {
                System.out.print(anInt +  " ");

            }

        }
        return matrix;
    }
}

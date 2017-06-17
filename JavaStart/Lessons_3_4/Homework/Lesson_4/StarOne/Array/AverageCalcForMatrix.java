package JavaStart.Lessons_3_4.Homework.Lesson_4.StarOne.Array;

/**
 * Created on 14.06.17.
 */
public class AverageCalcForMatrix {
    public static void main(String[] args) {
        System.out.println(avgCalc(new int[][] {{10, 30, 5},{3, 4, 0}}));
    }
    public static double avgCalc (int[][] array){
        double avg = 0;
        int counter = 0;

        for (int[] firstArray: array){
            for (int i : firstArray) {
                counter++;
                avg +=i;
            }
        }
        return avg / counter;
    }
}

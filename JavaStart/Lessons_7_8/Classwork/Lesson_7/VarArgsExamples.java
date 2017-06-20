package JavaStart.Lessons_7_8.Classwork.Lesson_7;

/**
 * Created on 017 17.06.17.
 */
public class VarArgsExamples {
    public static void main(String[] args) {

    }

    public static int m (int a, int b){ // Method don't need, because next method do exactly things.
        return a + b;
    }
    public static int sum (int... array){ // var-args
        int sum = 0;
        for (int elem : array) {
            sum += elem;
        }
        return sum;
    }
}

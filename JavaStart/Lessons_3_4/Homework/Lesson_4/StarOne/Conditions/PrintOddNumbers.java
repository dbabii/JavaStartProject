package JavaStart.Lessons_3_4.Homework.Lesson_4.StarOne.Conditions;

/**
 * Created by book on 010 10.06.17.
 */
public class PrintOddNumbers {
    public static void main(String[] args) {
        for (int i = 100; i > 70; i--){
            if (i % 2 != 0)
                System.out.print(i + " ");
        }
    }
}

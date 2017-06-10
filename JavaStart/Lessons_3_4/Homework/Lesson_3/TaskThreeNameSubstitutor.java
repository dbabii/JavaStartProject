package JavaStart.Lessons_3_4.Homework.Lesson_3;
import java.util.Scanner;

/**
 * Created by edu on 005 05.06.17.
 */
public class TaskThreeNameSubstitutor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter message: ");
        String message = scanner.nextLine();

        System.out.print("Enter name: ");
        String name = scanner.next();
        scanner.close();

        String replace = message.replace("$name", name);

        System.out.println(replace);


    }
}

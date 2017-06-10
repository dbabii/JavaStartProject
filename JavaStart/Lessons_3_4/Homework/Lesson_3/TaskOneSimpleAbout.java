package JavaStart.Lessons_3_4.Homework.Lesson_3;

import java.util.Scanner;

/**
 * Created by edu on 005 05.06.17.
 */
public class TaskOneSimpleAbout {

    public static void main(String[] args) {
        //Input
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name = scanner.next();

        System.out.print("Enter your surname: ");
        String surname = scanner.next();

        System.out.print("Enter your age: ");
        byte age = scanner.nextByte();
        scanner.close();

        System.out.println("I'm " + name + " " + surname + ", " + age + " years old.");



    }
}

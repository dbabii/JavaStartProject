package JavaStart.Lessons_3_4.Homework.Lesson_4.Condition;

import java.util.Scanner;

/**
 * Created on 017 17.06.17.
 */
public class AgeParser {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter age: ");

        int val = parseAge(scanner.next());
        System.out.println(val);

    }

    public static int parseAge (String ageString) {
        int value = Integer.parseInt(ageString);
        if (value > 0 && value < 121) {
        } else throw new IllegalArgumentException("Not correct Age");
        return value;

//        } else { throw new IllegalAccessException("You input age no correct.");

    }
}

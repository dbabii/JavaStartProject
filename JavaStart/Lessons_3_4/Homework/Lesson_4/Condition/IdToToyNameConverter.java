package JavaStart.Lessons_3_4.Homework.Lesson_4.Condition;

import java.util.Scanner;

/**
 * Created on 017 17.06.17.
 */
public class IdToToyNameConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter id Toy: ");
        int id = scanner.nextInt();
        getToyName(id);
    }

    public static String getToyName (int id){
        if (id == 0){
            System.out.println("Car");
        } else if (id == 1) {
            System.out.println("Lego");
        } else if (id == 2) {
            System.out.println("Doll");
        } else if (id == 3) {
            System.out.println("Puzzle");
        } else
            throw new IllegalArgumentException("Enter value between 0 and 3");
        String s = Integer.toString(id);
        return s;
    }
}

package JavaStart.Lessons_3_4.Homework.Lesson_4.Condition;

import java.util.Scanner;

/**
 * Created on 017 17.06.17.
 */
public class ToyNameToldConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter name toy: ");
        String nameToy = scanner.next();
        int id = getToyId(nameToy);
        System.out.println(id);


    }
    public static int getToyId (String name){
        switch (name){
            case ("Car"):
                return 0;
//                break;
            case ("Lego"):
                return 1;
//                break;
            case ("Doll"):
                return 2;
//                break;
            case ("Puzzle"):
                return 3;
//                break;
            default:
                throw new IllegalArgumentException("Wrong name toy");

        }

    }
}

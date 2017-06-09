package JavaStart.Lessons_3_4.Homework.Lesson_3;

import java.util.Scanner;

public class TaskFourSimpleFunctionCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter x: ");
        double x = scanner.nextDouble();

        scanner.close();

        double func = Math.log(Math.sin(x) + Math.pow(Math.E, x) * (Math.sqrt(x) / Math.PI));

        System.out.println("f(x) =  " + func);

    }
}

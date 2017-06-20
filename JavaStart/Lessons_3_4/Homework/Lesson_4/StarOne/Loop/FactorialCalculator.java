package JavaStart.Lessons_3_4.Homework.Lesson_4.StarOne.Loop;

import java.util.Scanner;

/**
 * Created on 020 20.06.17.
 */
public class FactorialCalculator {
    private static long factorial (int a){
        long fact = 1l;
        for (int i = 1; i <= a ; i++) {
            fact *= i;
        }
        return fact;
    }

    private static int readNum (){
        byte n = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please input number from 1 to 20 (include): ");

        int sc = scanner.nextInt();
        if ((sc >= 1) && (sc <= 20)) {
            } else {
                throw new IllegalArgumentException("Enter correct number.");
            }
        return sc;
    }

    public static void main(String[] args) {
        System.out.println(factorial(readNum()));
    }
}

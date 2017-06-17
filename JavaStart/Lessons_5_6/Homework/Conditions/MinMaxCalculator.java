package JavaStart.Lessons_5_6.Homework.Conditions;

import java.util.Scanner;

import static java.lang.System.*;

/**
 * Created on 017 17.06.17.
 */
public class MinMaxCalculator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(in);

        out.print("Enter number 1: ");
        int n1 = scan.nextInt();
        out.print("Enter number 2: ");
        int n2 = scan.nextInt();

        System.out.println("Max = " + minB(n1, n2) + ", " + "Min = " + maxB(n1,n2));

//        if (n1 > n2){
//            System.out.print("Max = " + n1);
//            System.out.println(", Min = " + n2);
//        }
//
//        else if (n1 == n2){
//            System.out.println("Your numbers equal");
//        }
//
//        else {
//            System.out.print("Max = " + n2);
//            System.out.println(", Min = " + n1);
//
//        }
    }

    public static int minB (int a, int b){
       if (a > b)
        return a;
        return b;
    }
    public static int maxB (int a, int b){
        if (a < b);
        return b;
    }

}

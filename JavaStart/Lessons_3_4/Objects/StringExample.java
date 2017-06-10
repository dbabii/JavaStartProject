package JavaStart.Lessons_3_4.Objects;

import jdk.internal.org.objectweb.asm.Handle;

/**
 * Created by edu on 003 03.06.17.
 */
public class StringExample {
    public static void main(String[] args) {
        int x = 10;
        x = x - 1;

        String s = "Hello";
        int length = s.length ();
        System.out.println(length);

        char c = s.charAt (1);
        System.out.println(c);

        char c1 = s.charAt(3);

        String substring = s.substring(1, 4);
        System.out.println(substring);

        String s2 = s.toUpperCase();
        System.out.println(s2);

        boolean h = s.startsWith("H");
        System.out.println(h);

        boolean hello = s.equals("HELLO");
        System.out.println("equals = " + hello);

        boolean hello1 = s.equalsIgnoreCase("HELLO");
        System.out.println("Equals = " + hello1);

        int h1 = s.indexOf('H');
        System.out.println(h1);
    }


}

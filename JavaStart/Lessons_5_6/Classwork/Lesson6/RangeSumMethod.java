package JavaStart.Lessons_5_6.Classwork.Lesson6;

/**
 * Created on 010 10.06.17.
 */
public class RangeSumMethod {
//    Creator
    public static int rangeSum (int from, int to) {
        int sum = 0;
        for (int i = from; i <= to; i++) {
            sum +=i;
        }

        return sum;
    }
//     Client
    public static void main(String[] args) {
        int numbers = rangeSum(0,100);
        System.out.println("numbers = " + numbers);

    }

}





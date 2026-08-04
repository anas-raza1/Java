import java.util.*;

public class PracticeSet1 {

    // average of 3 nums
    public static int average(int a, int b, int c) {
        int average = (a + b + c) / 3;
        return average;
    }

    // sum of all odd num from 1 to n
    public static int oddSum(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            if (i % 2 != 0) {
                sum += i;
            }
        }
        return sum;
    }

    // greater in 2 numbers
    public static int greaterNum(int a, int b) {
        if (a > b) {
            return a;
        } else {
            return b;
        }
    }

    // power of two nums
    public static int powerNum(int base, int power) {
        int pow = (int) Math.pow(base, power);
        return pow;
    }

    public static void main(String[] args) {
        System.out.println("Enter the first 3 numbers ");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        System.out.println("average of 3 nums = " + average(a, b, c));
        System.out.println("Enter the number for oddSum ; ");
        int n = sc.nextInt();
        System.out.println("sum of odd nums= " + oddSum(n));
        System.out.print("Greater Number :" + greaterNum(a, b));
        System.out.println("Power of two numbers" + powerNum(10, 2));
    }
}

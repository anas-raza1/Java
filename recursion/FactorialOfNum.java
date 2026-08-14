public class FactorialOfNum {
    static void factorial(int num, int result) {
        if (num == 1) {
            System.out.println(result);
            return;
        }
        factorial(num - 1, result * num);
    }

    static int factorial1(int num) {
        if (num == 1) {
            return num;
        }
        int result = factorial1(num - 1);
        return result * num;
    }

    public static int factorial2(int n) {
        if (n == 1 || n == 0) {
            return 1;
        }
        int fact1 = factorial2(n - 1);
        int fact = n * fact1;
        return fact;
    }

    public static void main(String[] args) {
        factorial(3, 1);
        int fact = factorial1(5);
        System.out.println(fact);

        int fact2 = factorial2(5);
        System.out.println(fact2);
    }
}
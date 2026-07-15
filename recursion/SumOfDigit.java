public class SumofDigit {

    static void sumOfDigit(int num, int sum) {
        // base case
        if (num == 0) {
            System.out.println(sum);
            return;
        }
        // small problem
        int digit = num % 10;
        sum = sum + digit;
        sumOfDigit(num / 10, sum);
    }

    static int sumOfDigit(int num) {
        // base case
        if (num == 0) {
            return 0;
        }
        // small problem

        // int sum = sumOfDigit(num / 10);
        // int digit = num % 10;
        // sum = sum + digit;
        // return sum;
        return num % 10 + sumOfDigit(num / 10);
    }

    public static void main(String[] args) {
        sumOfDigit(505, 0);
        System.out.println(sumOfDigit(202));
    }
}
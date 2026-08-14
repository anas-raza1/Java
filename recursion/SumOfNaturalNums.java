public class SumOfNaturalNums {
    public static void sumOfNums(int n, int num, int sum) {
        if (n == num) {
            sum += n;
            System.out.println(sum);
            return;
        }
        sum += n;
        sumOfNums(n + 1, num, sum);
    }

    public static void main(String[] args) {
        int num = 5;
        sumOfNums(1, num, 0);
    }
}

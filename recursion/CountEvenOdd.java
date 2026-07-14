public class CountEvenOdd {

    static void countEvenOdd(int range, int even, int odd) {
        // base case
        if (range == 0) {
            System.out.println("even " + even + " odd " + odd);
            return;
        }
        // logic build
        if (range % 2 == 0) {
            even++;
        } else {
            odd++;
        }
        // small problem
        countEvenOdd(range - 1, even, odd);
    }

    public static void main(String[] args) {
        countEvenOdd(13, 0, 0);
    }
}
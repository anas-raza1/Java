public class EvenOddPosSum {
    public static void main(String[] args) {
        int num = 13435;
        int position = 0;
        int evenSum = 0;
        int oddSum = 0;
        while (num != 0) {
            int lastDigit = num % 10;
            position++;
            if (position % 2 == 0) {
                evenSum = evenSum + lastDigit;
            } else {
                oddSum = oddSum + lastDigit;
            }
            num = num / 10;

        }
        System.out.println("even sum is " + evenSum);
        System.out.println("odd sum is " + oddSum);

    }
}

public class BinaryToDecimal {
    static int binaryToDecimal(int num, int pow, int sum) {
        if (num == 0) {
            return sum;
        }
        // logic
        int lastDigit = num % 10;
        sum = sum + lastDigit * (int) Math.pow(2, pow);
        // small problem
        int result = binaryToDecimal(num / 10, pow + 1, sum);
        return result;
    }

    public static void main(String[] args) {
        int decimal = binaryToDecimal(1010, 0, 0);
        System.out.println(decimal);
    }
}
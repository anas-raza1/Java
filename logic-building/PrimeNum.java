public class PrimeNum {
    public static void main(String[] args) {
        int num = 27;
        int count = 0;
        for (int i = 1; i <= num; i++) {
            if (num % i == 0) {
                count++;
            }
        }
        System.out.println(count == 2 ? "Prime Number" : "Not a Prime Number");

        int num2 = 23;
        for (int j = 2; j <= Math.sqrt(num2); j++) {
            if (num2 % j == 0) {
                System.out.println("Not a prime number");
                return;
            }
        }
        System.out.println("Prime Number");
    }
}

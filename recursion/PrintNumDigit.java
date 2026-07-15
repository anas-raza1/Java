public class PrintNumDigit {

    static void printDigit(int num) {
        // Base call
        if (num == 0) {
            return; // stack fall
        }
        // pre-processing
        System.out.println(num);
        // small problem
        printDigit(num / 10);
        System.out.println(num % 10); 
    }

    public static void main(String[] args) {
        printDigit(12345);

    }
}

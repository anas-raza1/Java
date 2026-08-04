import java.util.*;

public class NumberCounter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int pos = 0, neg = 0, zero = 0;
        char choice;
        do {
            System.out.print("Enter the number: ");
            int num = sc.nextInt();
            if (num > 0) {
                pos++;
            } else if (num < 0) {
                neg++;
            } else {
                zero++;
            }
            System.out.println("continue (y/n) : ");
            choice = sc.next().charAt(0);
        } while (choice == 'y' || choice == 'Y');
        System.out.println("Positives: " + pos);
        System.out.println("Negatives: " + neg);
        System.out.println("Zeros: " + zero);

        sc.close();
    }
}

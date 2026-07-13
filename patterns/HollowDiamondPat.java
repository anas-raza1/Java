import java.util.*;

public class HollowDiamondPat {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the size: ");
        int size = scan.nextInt();
        for (int i = 1; i <= size; i++) {
            for (int j = i; j <= size; j++) {
                System.out.print("*");
            }
            for (int j = 1; j <= 2 * i - 2; j++) {
                System.out.print(" ");
            }
            for (int j = i; j <= size; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i = 1; i <= size; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            for (int j = 2 * i - 2; j < 2 * size - 2; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        scan.close();
    }
}
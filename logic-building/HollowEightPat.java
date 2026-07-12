import java.util.Scanner;

public class HollowEightPat {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the size: ");
        int size = scan.nextInt();

        for (int col = 1; col < size * 2; col++) {
            for (int row = 1; row <= size; row++) {
                if ((col == 1 || col == size || col == (size * 2 - 1)) && (row == 1 || row == size)) {
                    System.out.print(" ");
                } else if (col == 1 || col == size || col == (size * 2 - 1) || row == 1 || row == size) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}

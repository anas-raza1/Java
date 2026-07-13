import java.util.Scanner;

public class InvertedPyramid {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the size: ");
        int range = scan.nextInt();
        for (int row = 1; row <= range; row++) {
            for (int col = row; col <= range; col++) {
                System.out.print("*");
            }
            System.out.println();
        }
        scan.close();

    }
}

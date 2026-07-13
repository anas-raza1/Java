import java.util.Scanner;

public class HollowPyramid {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the size: ");
        int size = scan.nextInt();
        for (int row = 1; row <= size; row++) {
            for (int space = row; space < size; space++) {
                System.out.print(" ");
            }
            for (int star = 1; star <= row * 2 - 1; star++) {
                if (star == 1 || row == size || star == (row * 2 - 1)) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        scan.close();
    }
}

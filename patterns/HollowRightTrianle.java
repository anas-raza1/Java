public class HollowRightTrianle {
    public static void main(String[] args) {
        int range = 5;
        for (int row = 0; row < range; row++) {
            for (int col = 0; col <= row; col++) {
                if (row == col || row == range - 1 || col == 0) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}

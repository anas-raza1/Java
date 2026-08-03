public class InvertedHalfPyramid {
    public static void main(String[] args) {
        int range = 4;
        for (int row = 1; row <= range; row++) {
            for (int col = 1; col <= range - row; col++) {
                System.out.print(" ");
            }
            for (int col = 1; col <= row; col++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
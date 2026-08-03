public class SolidRectangle {

    public static void main(String[] args) {
        int n = 4;
        int m = 5;
        for (int row = 0; row < n; row++) {
            for (int col = 0; col < m; col++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
public class MazePath {

    static void mazePos(int row, int col, int endrow, int endcol, String result) {
        // base case
        if (row == endrow && col == endcol) {
            System.out.println(result);
            return;
        } else if (row > endrow || col > endcol) {
            return;
        }
        // small problem
        mazePos(row + 1, col, endrow, endcol, result + "V");
        mazePos(row, col + 1, endrow, endcol, result + "H");
    }

    public static void main(String[] args) {
        mazePos(0, 0, 2, 2, "");
    }
}
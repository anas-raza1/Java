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

    
    static int countPaths(int row, int col, int endrow, int endcol){
        //base case
        if(row == endrow || col == endcol){
            return 0;
        } else if(row == endrow-1 && col == endcol-1){
            return 1;
        }
        // move downwards
        int downPaths = countPaths(row+1, col, endrow, endcol);
        // move rightwards
        int rightPaths = countPaths(row, col+1, endrow, endcol);

        return downPaths+rightPaths;
    }
    public static void main(String[] args) {
        int endcol = 3;
        int endrow = 3;
        mazePos(0, 0, endrow, endcol, "");
        System.out.println();
        int totalPaths = countPaths(0, 0, endrow, endcol);
        System.out.println(totalPaths);
    }
}
class NQueens {
    // chess board
    boolean board[][];
    public int totalNQueens(int n) {
        board = new boolean[n][n]; //chess fill false
        return helper(0, n);
    }
    boolean willPlace(int row, int col) {
        //case-1 above row
        for (int i = row; i >= 0; i--) {
            if (board[i][col]) {
                return false;
            }
        }
        //case-2 left diagonal
        for (int i = row, j = col; i >= 0 && j >= 0; i--, j--) {
            if (board[i][j]) {
                return false;
            }
        }
        //case-3 right diagonal
        for (int i = row, j = col; i >= 0 && j < board[0].length; i--, j++) {
            if (board[i][j]) {
                return false;
            }
        }
        return true; // can place a queen
    }

    int helper(int row, int n) {
        if (row == n) {
            return 1;
        }
        int count = 0;
        //place queen
        for (int col = 0; col < n; col++) {
            if (willPlace(row, col)) {
                board[row][col] = true; //place a queen
                count = count + helper(row + 1, n);
                //stack fall
                board[row][col] = false; //undo
            }
        }
        return count;
    }
}
public class Prob57NQueens2 {
    public static void main(String[] args) {
        NQueens nq = new NQueens();
        int n = 4;
        int result = nq.totalNQueens(n);
        System.out.println(result);
    }
}

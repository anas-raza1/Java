class WSearch {
    public boolean exist(char[][] board, String word) {
        // Traverse board
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                if (isFound(board, word, i, j)) {
                    return true;
                }
            }
        }
        return false;
    }
    int directions[][] = { { 1, 0 }, { 0, 1 }, { -1, 0 }, { 0, -1 } };

    //word exist or not
    boolean isFound(char[][] board, String word, int row, int col) {
        //base case
        if (word.length() == 0) {
            return true;
        }
        //negative case
        if (row < 0 || col < 0 || row >= board.length || col >= board[0].length || board[row][col] != word.charAt(0)) {
            return false;
        }
        //mark visited
        board[row][col] = '#';
        boolean isMatch = false; //not corect result
        //move in all directions
        for (int direction = 0; direction < directions.length; direction++) {
            int nextRow = directions[direction][0];
            int nextCol = directions[direction][1];
            //recursive call
            isMatch = isFound(board, word.substring(1), row + nextRow, col + nextCol);
            if (isMatch) {
                break;
            }
            //stack fall Backtracking (undo)
        }
        board[row][col] = word.charAt(0);
        return isMatch;
    }
}
public class Prob79WordSearch {
    public static void main(String[] args) {
        WSearch ws = new WSearch();
        char board [][] = {{'A','B','C','E'}, {'S','F','C','S'},{'A','D','E','E'}};
        String word = "ABCCED";
        boolean result = ws.exist(board, word);
        System.out.println(result);
    }
}

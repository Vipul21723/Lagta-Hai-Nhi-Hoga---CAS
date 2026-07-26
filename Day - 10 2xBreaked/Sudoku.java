public class Sudoku {
    public boolean helper(char[][] board, int row, int col) {
        int nrow = 0;
        int ncol = 0;

        if(col != board.length-1) {
            nrow = row;
            ncol = col + 1;
        } else {
            nrow = row + 1;
            ncol = 0;
        }

        if(board[row][col] != '.') {
            if(helper(board, nrow, ncol)) {
                return true;
            } else {
                for(int i=1; i<=0)
            }
        }
    }
    public static solveSudoku(char[][] board) {
        healper(board, 0, 0)
    }
}

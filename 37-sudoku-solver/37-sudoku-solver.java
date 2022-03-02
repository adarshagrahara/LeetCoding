class Solution {
    public void solveSudoku(char[][] board) {
        solve(board);
    }
    
    public boolean solve(char[][] board) {
        int n = board.length;
        int row = -1;
        int col = -1;
        boolean empty = false;
        
        // to find the first empty cell
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (board[i][j] == '.') {
                    row = i;
                    col = j;
                    empty = true;
                    break;
                }
            }
            
            if (empty) {
                break;
            }
        }
        
        if (!empty) {
            return true;
        }
        
        // recursion
        for(int number = 1; number <= 9; number++) {
            if (isSafe(board, row, col, number)) {
                board[row][col] = (char) (number + '0');
                if (solve(board)) {
                    return true;
                } else {
                    // backtracking
                    board[row][col] = '.';
                }
            }
        }
        
        return false;
    }
    
    public boolean isSafe(char[][] board, int row, int col, int number) {
        // to check for row and col
        for (int i = 0; i < board.length; i++) {
            if (board[row][i] == (char) (number + '0')) {
                return false;
            }
            
            if (board[i][col] == (char) (number + '0')) {
                return false;
            }
        }
        
        // to check for 3*3 grid
        int rowStart = row - (row % 3);
        int colStart = col - (col % 3);
        for (int i = rowStart; i < rowStart + 3; i++) {
            for (int j = colStart; j < colStart + 3; j++) {
                if (board[i][j] == (char) (number + '0')) {
                    return false;
                }
            }
        }
        
        return true;
    }
}
class Solution {
    private boolean solve(char[][] board) {
        for (int row = 0; row < 9; row++) {
            for (int col = 0; col < 9; col++) {
                if (board[row][col] == '.') { // Find empty cell
                    for (char num = '1'; num <= '9'; num++) {
                        if (isValid(board, row, col, num)) {
                            board[row][col] = num; // Place number
                            if (solve(board))
                                return true; // Success
                            board[row][col] = '.'; // Backtrack
                        }
                    }
                    return false; // Trigger backtracking
                }
            }
        }
        return true; // Solved
    }

    private boolean isValid(char[][] board, int row, int col, char num) {
        int boxRow = (row / 3) * 3, boxCol = (col / 3) * 3;
        for (int i = 0; i < 9; i++) {
            if (board[row][i] == num || board[i][col] == num ||
                    board[boxRow + i / 3][boxCol + i % 3] == num)
                return false;
        }
        return true;
    }

    public void solveSudoku(char[][] board) {

        solve(board);

    }
}
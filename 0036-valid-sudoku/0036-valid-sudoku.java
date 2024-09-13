class Solution {
     public boolean isValidSudoku(char[][] board) {
        HashSet<String> seen = new HashSet<>();

        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                char current = board[i][j];
                if (current != '.') {
                    if (!seen.add(current + " in row " + i) ||
                        !seen.add(current + " in column " + j) ||
                        !seen.add(current + " in box " + i / 3 + "-" + j / 3)) {
                        return false;
                    }
                }
            }
        }
        return true;
    }
}
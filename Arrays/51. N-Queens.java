class Solution {
    public List<List<String>> solveNQueens(int n) {
        List<List<String>> res = new ArrayList<>();
        char[][] board = new char[n][n];

        for(char[] row : board) Arrays.fill(row, '.');

        backtrack(0, board, res, n);
        return res;
    }

    private void backtrack(int row, char[][] board, List<List<String>> res, int n) {
        if(row == n){
            res.add(construct(board));
            return;
        }

        for(int col = 0; col < n; col++){
            if(isSafe(board, row, col, n)){
                board[row][col] = 'Q';
                backtrack(row + 1, board, res, n);
                board[row][col] = '.'; // undo
            }
        }
    }

    private boolean isSafe(char[][] board, int r, int c, int n){
        // column
        for(int i = 0; i < r; i++)
            if(board[i][c] == 'Q') return false;

        // left diagonal
        for(int i = r-1, j = c-1; i >= 0 && j >= 0; i--, j--)
            if(board[i][j] == 'Q') return false;

        // right diagonal
        for(int i = r-1, j = c+1; i >= 0 && j < n; i--, j++)
            if(board[i][j] == 'Q') return false;

        return true;
    }

    private List<String> construct(char[][] board){
        List<String> list = new ArrayList<>();
        for(char[] row : board){
            list.add(new String(row));
        }
        return list;
    }
}

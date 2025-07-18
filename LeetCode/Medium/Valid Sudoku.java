class Solution {
    public boolean isValidSudoku(char[][] board) {
        int n = board.length;
        int m = board[0].length;

        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
                if(board[i][j] == '.') continue;

                char val = board[i][j];

                for(int k = 0; k < 9; k++){
                    if(i != k && board[k][j] == val) return false;
                    if(j != k && board[i][k] == val) return false;
                }

                int r = (i / 3) * 3;
                int c = (j / 3) * 3;
                for(int k = r; k < r + 3; k++){
                    for(int l = c; l < c + 3; l++){
                        if(k == i && l == j) continue;
                        if(board[k][l] == val) return false;
                    }
                }
            }
        }

        return true;
    }
}

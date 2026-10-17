class Solution {
    public boolean isValidSudoku(char[][] board) {
        boolean[][] rows = new boolean[9][9];
        boolean[][] cols = new boolean[9][9];
        boolean[][] boxs = new boolean[9][9];
        
        for(int i = 0; i < board.length; i++){
            for(int j = 0; j < board.length; j++){
                if (board[i][j] == '.') continue;
                
                int index = (i/3)*3 + (j/3);
                int val = board[i][j] - '1';
                
                if(rows[i][val] || cols[j][val] || boxs[index][val]) return false;

                rows[i][val] = cols[j][val] = boxs[index][val] = true;
            }
        }
        
        return true;
    }
}

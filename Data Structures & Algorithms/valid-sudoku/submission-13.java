class Solution {
    public boolean isValidSudoku(char[][] board) {
       int[] rows = new int[9];
       int[] cols = new int[9];
       int[] boxes = new int[9];

       for(int row = 0; row < 9; row++){
        for(int col = 0; col < 9; col++){
            if(board[row][col] == '.') continue;

            int index = (row/3)*3 + col/3;

            int num = board[row][col] - '1';

            int val = 1 << num; 

            if((rows[row] & val) != 0 || (cols[col] & val) != 0 || (boxes[index] & val) != 0){
                return false;
            }

            rows[row] |= val;
            cols[col] |= val;
            boxes[index] |= val;
        }
       }

       return true;
    }
}

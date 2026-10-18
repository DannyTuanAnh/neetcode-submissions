class Solution {
    public boolean isValidSudoku(char[][] board) {
       int[] rows = new int[9];
       int[] cols = new int[9];
       int[] boxs = new int[9];

       for(int i = 0; i < board.length; i++){
        for(int j = 0; j < board[0].length; j++){
            if(board[i][j] == '.') continue;

            int num = board[i][j] - '1';
            int mask = 1 << num;
            int index = (i / 3)*3 + (j/3);


            if((rows[i] & mask) != 0 || (cols[j] & mask) != 0 || (boxs[index] & mask) != 0){
                return false;
            }

            rows[i] |= mask;
            cols[j] |= mask;
            boxs[index] |= mask;
        }
       }

       return true;
    }
}

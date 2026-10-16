class Solution {
    public boolean isValidSudoku(char[][] board) {
        int a = board.length;


        return isValidCols(board,a) && isValidRows(board, a) && isValidSubBoxes(board, a);
    }

    public boolean isValidSubBoxes(char[][] board, int a){
        HashMap<String, HashSet<Integer>> seen = new HashMap<>();

        for (int row = 0; row < a; row++) {

            for (int col = 0; col < a; col++) {
                if(board[row][col] != '.') {
                    int val = Integer.parseInt(String.valueOf(board[row][col]));

                    boolean status = seen.computeIfAbsent(String.format("[%d,%d]", row / 3, col / 3), key -> new HashSet<>()).add(val);
                    
                    if (!status) return false;
                }
            }
        }

        return true;
    }

    public boolean isValidRows(char[][] board, int a){
        for (char[] rows : board) {
            HashSet<Integer> seen = new HashSet<>();

            for (int col = 0; col < a; col++) {
                if (rows[col] != '.') {
                    int val = Integer.parseInt(String.valueOf(rows[col]));

                    if (!seen.add(val)) return false;
                }
            }
        }

        return true;
    }

    public boolean isValidCols(char[][] board, int a) {
        for (int col = 0; col < a; col++) {
            HashSet<Integer> seen = new HashSet<>();

            for (char[] rows : board) {
                if (rows[col] != '.') {
                    int val = Integer.parseInt(String.valueOf(rows[col]));

                    if (!seen.add(val)) return false;
                }
            }
        }

        return true;
    }
}

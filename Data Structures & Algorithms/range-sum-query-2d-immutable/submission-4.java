class NumMatrix {
     int[][] myMatrix;

        public NumMatrix(int[][] matrix) {
            int m = matrix.length + 1;
            int n = matrix[0].length + 1;

            myMatrix = new int[m][n];

            for (int row = 1; row < m; row++) {
                for (int col = 1; col < n; col++) {
                    if(row == 1){
                        myMatrix[row][col] =  myMatrix[row][col - 1] + myMatrix[row - 1][col] + matrix[row-1][col-1];
                        continue;
                    }

                    myMatrix[row][col] =  myMatrix[row][col - 1] + myMatrix[row - 1][col] + matrix[row-1][col-1] - myMatrix[row-1][col-1];
                }
            }
        }

    public int sumRegion(int row1, int col1, int row2, int col2) {
            return myMatrix[row2+1][col2+1] - myMatrix[row1][col2+1] - myMatrix[row2+1][col1] + myMatrix[row1][col1] ;
        }
}

/**
 * Your NumMatrix object will be instantiated and called as such:
 * NumMatrix obj = new NumMatrix(matrix);
 * int param_1 = obj.sumRegion(row1,col1,row2,col2);
 */
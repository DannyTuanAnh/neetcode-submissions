class NumMatrix {

    int[][] myMatrix;

    public NumMatrix(int[][] matrix) {
        myMatrix = new int[matrix.length][matrix[0].length];


        for (int i = 0; i < matrix.length; i++) {

            int consecutive = 0;

            for (int j = 0; j < matrix[0].length; j++) {
                if (i == 0) {
                    consecutive += matrix[i][j];
                    myMatrix[i][j] = consecutive;
                } else {
                    consecutive += matrix[i][j];
                    myMatrix[i][j] = consecutive + myMatrix[i - 1][j];
                }

            }
        }
    }

    public int sumRegion(int row1, int col1, int row2, int col2) {
        int result = myMatrix[row2][col2];

        if (row1 > 0) {
            result -= myMatrix[row1 - 1][col2];
        }

        if (col1 > 0) {
            result -= myMatrix[row2][col1 - 1];
        }

        if (row1 > 0 && col1 > 0){
            result += myMatrix[row1 - 1][col1 - 1];
        }


        return result;
    }
}

/**
 * Your NumMatrix object will be instantiated and called as such:
 * NumMatrix obj = new NumMatrix(matrix);
 * int param_1 = obj.sumRegion(row1,col1,row2,col2);
 */
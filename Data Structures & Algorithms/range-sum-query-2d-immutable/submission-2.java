class NumMatrix {

    int[][] myMatrix;

    public NumMatrix(int[][] matrix) {
        int rows=matrix.length;
        int cols=matrix[0].length;
        myMatrix =new int[rows+1][cols+1];
        for(int i=0;i<rows;i++)
        {
            for(int j=0;j<cols;j++)
            {
                myMatrix[i+1][j+1]=matrix[i][j]+myMatrix[i][j+1]+myMatrix[i+1][j]-myMatrix[i][j];

            }
        }

    }

    public int sumRegion(int row1, int col1, int row2, int col2) {
        return myMatrix[row2+1][col2+1]-myMatrix[row1][col2+1]-myMatrix[row2+1][col1]+myMatrix[row1][col1];
    }
}

/**
 * Your NumMatrix object will be instantiated and called as such:
 * NumMatrix obj = new NumMatrix(matrix);
 * int param_1 = obj.sumRegion(row1,col1,row2,col2);
 */
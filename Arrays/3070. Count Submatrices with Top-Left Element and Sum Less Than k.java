class Solution {
    public int countSubmatrices(int[][] grid, int k) {
        int m = grid.length;
        int n = grid[0].length;
        int[][] sumMatrix = new int[m][n];
        int count = 0;
        sumMatrix[0][0] = grid[0][0];
        if (sumMatrix[0][0] <= k) count++;

        for(int i=1; i<m; i++){
            sumMatrix[i][0] = sumMatrix[i-1][0] + grid[i][0];
            if (sumMatrix[i][0] <= k) count++;
        }

        for(int j=1; j<n; j++){
            sumMatrix[0][j] = sumMatrix[0][j-1] + grid[0][j];
            if (sumMatrix[0][j] <= k) count++;
        }

        for(int i=1; i<m; i++){
            for(int j=1; j<n; j++){
                sumMatrix[i][j] = sumMatrix[i][j-1] + sumMatrix[i-1][j] + grid[i][j] - sumMatrix[i-1][j-1];
                if(sumMatrix[i][j] <= k)    count++;
            }
        }
        return count;
    }
}

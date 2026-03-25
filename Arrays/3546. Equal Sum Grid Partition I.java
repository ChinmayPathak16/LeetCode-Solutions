class Solution {
    public boolean canPartitionGrid(int[][] grid) {
        
        int n = grid.length;
        int m = grid[0].length;

        long totalSum = 0;
        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                totalSum += grid[i][j];
            }
        }

        long rowSumHorizontal = 0;
        for(int i=0; i<n-1; i++){
            for(int j=0; j<m; j++){
                rowSumHorizontal += grid[i][j];
            }
            if(totalSum - rowSumHorizontal == rowSumHorizontal)    return true;
        }

        long columnSumVertical = 0;
        for(int j=0; j<m-1; j++){
            for(int i=0; i<n; i++){
                columnSumVertical += grid[i][j];
            }
            if(totalSum - columnSumVertical == columnSumVertical)   return true;
        }

        return false;
    }
}

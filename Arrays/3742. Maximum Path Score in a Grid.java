class Solution {
    int m;
    int n;
    int c;
    public int maxPathScore(int[][] grid, int k) {
        m = grid.length;
        n = grid[0].length;
        c = k + 1;
        int[][][] dp = new int[m][n][c];
        for(int i = 0; i < m; i++) {
            for(int j = 0; j < n; j++) {
                for(int c = 0; c <= k; c++) {
                    dp[i][j][c] = -1;
                }
            }
        }

        dp[0][0][0] = 0;

        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                for(int c=0; c<=k; c++){
                    if(dp[i][j][c] == -1)   continue;

                    if(j+1 < n){
                        int cost = 0;
                        if(grid[i][j+1] != 0){
                            cost = 1;
                        }
                        int newCost = cost+c;

                        if(newCost <= k){
                            int newScore = dp[i][j][c] + grid[i][j+1];
                            dp[i][j+1][newCost] = Math.max(dp[i][j+1][newCost], newScore);
                        }
                    }

                    if(i+1 < m){
                        int cost = 0;
                        if(grid[i+1][j] != 0){
                            cost = 1;
                        }
                        int newCost = cost+c;

                        if(newCost <= k){
                            int newScore = dp[i][j][c] + grid[i+1][j];
                            dp[i+1][j][newCost] = Math.max(dp[i+1][j][newCost], newScore);
                        }
                    }

                }
            }
        }
        int ans = -1;
        for(int c=0; c<=k; c++){
            ans = Math.max(ans,dp[m-1][n-1][c]);
        }
        return ans;
    }
}

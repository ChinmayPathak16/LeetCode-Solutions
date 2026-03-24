class Solution {
    public int[][] constructProductMatrix(int[][] grid) {
        int n = grid.length;
        int m = grid[0].length;
        int[][] prefix = new int[n][m];
        int[][] suffix = new int[n][m];
        int[][] product = new int[n][m];
        int mod = 12345;

        //grid mod 12345
        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                grid[i][j] = grid[i][j] % mod;
            }
        }

        prefix[0][0] = 1;
        suffix[n-1][m-1] = 1;

        //prefix pro
        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                if(i == 0 && j == 0)    continue;
                if(j == 0 && i != 0){
                    prefix[i][j] = prefix[i-1][m-1] * grid[i-1][m-1];
                    prefix[i][j] = prefix[i][j] % mod;
                    continue;
                }
                prefix[i][j] = prefix[i][j-1] * grid[i][j-1];
                prefix[i][j] = prefix[i][j] % mod;
            }
        }

        //suffix pro
        for(int i = n-1; i>=0; i--){
            for(int j = m-1; j>=0; j--){
                if(i == n-1 && j == m-1)    continue;
                if(j == m-1 && i != n-1){
                    suffix[i][j] = suffix[i+1][0] * grid[i+1][0];
                    suffix[i][j] = suffix[i][j] % mod;
                    continue;
                }
                suffix[i][j] = suffix[i][j+1] * grid[i][j+1];
                suffix[i][j] = suffix[i][j] % mod;
            }
        }

        //product
        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                product[i][j] = (suffix[i][j] * prefix[i][j]) % mod;
            }
        }
        return product;
    }
}

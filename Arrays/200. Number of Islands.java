class Solution {
    private void dfs(char[][] grid, int i, int j){
        if(i<0 || j<0 || i>=grid.length || j>=grid[0].length || grid[i][j] == '0'){
            return;
        }
        grid[i][j] = '0';
        dfs(grid, i-1, j);
        dfs(grid, i+1, j);
        dfs(grid, i, j-1);
        dfs(grid, i, j+1);
    }
    public int numIslands(char[][] grid) {
        int n = grid.length;
        int m = grid[0].length;
        int cnt = 0;
        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                if(grid[i][j] == '1'){
                    dfs(grid, i, j);
                    cnt++;
                }
            }
        }
        return cnt;
    }
}

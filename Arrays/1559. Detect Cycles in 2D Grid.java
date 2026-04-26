class Solution {
    public boolean containsCycle(char[][] grid) {
        int n = grid.length;
        int m = grid[0].length;
        boolean[][] visited = new boolean[n][m];
        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                visited[i][j] = false;
            }
        }
        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                if(!visited[i][j]){
                    if(dfs(grid, i, j, -1, -1, visited)){
                        return true;
                    }
                }
            }
        }
        return false;
    }
    private boolean dfs(char[][] grid, int r, int c, int pr, int pc, boolean[][] visited){
        visited[r][c] = true;

        int[] dr = {-1, 1, 0, 0};
        int[] dc = {0, 0, 1, -1};

        for(int k=0; k<4; k++){
            int nr = r+dr[k];
            int nc = c+dc[k];

            if(nr>=0 && nc>=00 && nr<grid.length && nc<grid[0].length && grid[nr][nc] == grid[r][c]){

                if(!visited[nr][nc]){
                    if(dfs(grid, nr, nc, r, c, visited)){
                        return true;
                    }
                }
                else if(nr != pr || nc != pc){
                    return true;
                }
            }
        }
        return false;
    }
}

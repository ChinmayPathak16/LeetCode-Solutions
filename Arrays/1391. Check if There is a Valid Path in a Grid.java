class Solution {
    int n, m;
    boolean visited[][];

    boolean canRight[] = {false, true, false, false, true, false, true};
    boolean canLeft[]  = {false, true, false, true, false, true, false};
    boolean canUp[]    = {false, false, true, false, false, true, true};
    boolean canDown[]  = {false, false, true, true, true, false, false};

    int directions[][] = {{0,1},{0,-1},{-1,0},{1,0}};

    public boolean hasValidPath(int[][] grid) {
        m = grid.length;
        n = grid[0].length;
        visited = new boolean[m][n];
        return dfs(0, 0, grid);
    }

    private boolean dfs(int r, int c, int[][] grid){
        if(r == m-1 && c == n-1) return true;

        visited[r][c] = true;

        for(int i = 0; i < 4; i++){
            int nr = r + directions[i][0];
            int nc = c + directions[i][1];

            if(nr >= 0 && nc >= 0 && nr < m && nc < n && !visited[nr][nc]
               && canMove(grid[r][c], grid[nr][nc], i)){
                
                if(dfs(nr, nc, grid)) return true;
            }
        }
        return false;
    }

    private boolean canMove(int curr, int next, int dir){
        if(dir == 0){
            return canRight[curr] && canLeft[next];
        } else if(dir == 1){
            return canLeft[curr] && canRight[next];
        } else if(dir == 2){
            return canUp[curr] && canDown[next];
        } else {
            return canDown[curr] && canUp[next];
        }
    }
}

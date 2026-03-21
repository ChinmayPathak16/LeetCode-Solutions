class Solution {
    public int[][] reverseSubmatrix(int[][] grid, int x, int y, int k) {
        int m = grid.length;
        int n = grid[0].length;

        for(int j=y; j<y+k; j++){
            int a = x;
            int b = x+k-1;
            while(a <= b){
                int t = grid[a][j];
                grid[a][j] = grid[b][j];
                grid[b][j] = t;
                a++;
                b--;
            }    
        }

        return grid;
    }
    
}

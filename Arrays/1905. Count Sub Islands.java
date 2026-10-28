class Solution {
    private boolean dfs(int[][] g1, int[][] g2, int i, int j){
        if(i<0 || j<0 || i>=g1.length || j>=g1[0].length || g2[i][j] == 0){
            return true;
        }

        g2[i][j] = 0;

        boolean valid = true;
        if(g1[i][j] == 0){
            valid = false;
        }
        boolean up = dfs(g1,g2,i-1,j);
        boolean down = dfs(g1,g2,i+1,j);
        boolean left = dfs(g1,g2,i,j-1);
        boolean right = dfs(g1,g2,i,j+1);
        return up && down && left && right && valid;
    }
    public int countSubIslands(int[][] g1, int[][] g2) {
        int count = 0;
        for(int i=0; i<g1.length; i++){
            for(int j=0; j<g1[0].length; j++){
                if(g2[i][j] == 1){
                    if(dfs(g1,g2,i,j)){
                        count++;
                    }
                }
            }
        }
        return count;
    }
}

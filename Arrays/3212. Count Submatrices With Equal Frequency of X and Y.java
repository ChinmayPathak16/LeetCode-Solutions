class Solution {
    public int numberOfSubmatrices(char[][] grid) {
        int rows = grid.length;
        int cols = grid[0].length;
        int[][] cntX = new int[rows][cols];
        int[][] cntY = new int[rows][cols];

        if (grid[0][0] == 'X')  cntX[0][0] = 1;
        else if (grid[0][0] == 'Y') cntY[0][0] = 1;
        

        for (int j = 1; j < cols; j++) {
            cntX[0][j] = cntX[0][j-1];
            cntY[0][j] = cntY[0][j-1];
            
            if (grid[0][j] == 'X') cntX[0][j]++;
            else if (grid[0][j] == 'Y') cntY[0][j]++;
        }

        for (int i = 1; i < rows; i++) {
            cntX[i][0] = cntX[i-1][0];
            cntY[i][0] = cntY[i-1][0];

            if (grid[i][0] == 'X') cntX[i][0]++;
            else if (grid[i][0] == 'Y')  cntY[i][0]++;
        }

        for(int i = 1; i < rows; i++){
            for(int j = 1; j < cols; j++){
                cntX[i][j] = cntX[i-1][j] + cntX[i][j-1] - cntX[i-1][j-1];
                cntY[i][j] = cntY[i-1][j] + cntY[i][j-1] - cntY[i-1][j-1];
                if (grid[i][j] == 'X') cntX[i][j]++;
                else if (grid[i][j] == 'Y') cntY[i][j]++;
            }
        }
        int count = 0;
        for(int i = 0; i < rows; i++){
            for(int j = 0; j < cols; j++){
                if(cntX[i][j] == cntY[i][j] && cntX[i][j] >= 1) count++;
            }
        }
        return count;
    }
}

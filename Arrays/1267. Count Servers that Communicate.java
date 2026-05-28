class Solution {
    public int countServers(int[][] grid) {
        int count = 0;
        for (int i = 0; i < grid.length; i++) {
            int cnt = 0;
            for (int j = 0; j < grid[0].length; j++) {
                if (grid[i][j] > 0) {
                    cnt++;
                }
            }
            if (cnt > 1) {
                for (int j = 0; j < grid[0].length; j++) {
                    if (grid[i][j] == 1) {
                        count++;
                        grid[i][j] = 2;
                    }
                }
            }

        }

        for (int j = 0; j < grid[0].length; j++) {
            int cnt = 0;
            for (int i = 0; i < grid.length; i++) {
                if (grid[i][j] > 0) {
                    cnt++;
                }
            }
            if (cnt > 1) {
                for (int i = 0; i < grid.length; i++) {
                    if (grid[i][j] == 1) {
                        count++;
                        grid[i][j] = 2;
                    }
                }
            }
        }
        return count;
    }
}

class Solution {
    static final int mod = 1000000007;
    static final long LIMIT = (long)1e18; // prevent overflow

    public int maxProductPath(int[][] grid) {
        int m = grid.length, n = grid[0].length;

        long[][] maxMat = new long[m][n];
        long[][] minMat = new long[m][n];

        maxMat[0][0] = minMat[0][0] = grid[0][0];

        // First column
        for (int i = 1; i < m; i++) {
            long val = maxMat[i - 1][0] * grid[i][0];
            maxMat[i][0] = minMat[i][0] = clamp(val);
        }

        // First row
        for (int j = 1; j < n; j++) {
            long val = maxMat[0][j - 1] * grid[0][j];
            maxMat[0][j] = minMat[0][j] = clamp(val);
        }

        for (int i = 1; i < m; i++) {
            for (int j = 1; j < n; j++) {
                long val = grid[i][j];

                long a = clamp(maxMat[i - 1][j] * val);
                long b = clamp(minMat[i - 1][j] * val);
                long c = clamp(maxMat[i][j - 1] * val);
                long d = clamp(minMat[i][j - 1] * val);

                maxMat[i][j] = Math.max(Math.max(a, b), Math.max(c, d));
                minMat[i][j] = Math.min(Math.min(a, b), Math.min(c, d));
            }
        }

        long ans = maxMat[m - 1][n - 1];

        return ans < 0 ? -1 : (int)(ans % mod);
    }

    private long clamp(long val) {
        if (val > LIMIT) return LIMIT;
        if (val < -LIMIT) return -LIMIT;
        return val;
    }
}

class Solution {
    int[][] dp;

    int f(int i, int j) {
        if (i == 0 || j == 0) return 1;
        if (i < 0 || j < 0) return 0;

        if (dp[i][j] != -1) return dp[i][j];

        int up = f(i - 1, j);
        int left = f(i, j - 1);

        return dp[i][j] = up + left;
    }

    public int uniquePaths(int m, int n) {
        dp = new int[m][n];
        for (int[] row : dp) {
            Arrays.fill(row, -1);
        }
        return f(m - 1, n - 1);
    }
}

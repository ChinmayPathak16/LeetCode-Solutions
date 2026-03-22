class Solution {
    public boolean findRotation(int[][] mat, int[][] target) {
        int m = mat.length;
        int n = mat[0].length;
        boolean reachedGoal = false;
        for (int i = 1; i <= 4; i++) {
            rotate(mat, m, n);
            reachedGoal = check(mat, target, m, n);
            if (reachedGoal)
                return reachedGoal;
        }
        return reachedGoal;
    }

    private void rotate(int[][] mat, int m, int n) {
        for (int i = 0; i < m; i++) {
            for (int j = i; j < n; j++) {
                swap(mat, i, j);
            }
        }

        for (int i = 0; i < m; i++) {
            int left = 0;
            int right = n - 1;
            while (left < right) {
                int temp = mat[i][left];
                mat[i][left] = mat[i][right];
                mat[i][right] = temp;
                left++;
                right--;
            }
        }
    }

    private void swap(int[][] mat, int i, int j) {
        int t = mat[i][j];
        mat[i][j] = mat[j][i];
        mat[j][i] = t;
    }

    private boolean check(int[][] mat, int[][] target, int m, int n) {
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (mat[i][j] != target[i][j])
                    return false;
            }
        }
        return true;
    }
}

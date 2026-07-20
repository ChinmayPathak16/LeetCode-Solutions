class Solution {
    private void reverse(List<Integer> list, int start, int end) {
        while (start < end) {
            int t = list.get(start);
            list.set(start, list.get(end));
            list.set(end, t);
            start++;
            end--;
        }
    }

    public List<List<Integer>> shiftGrid(int[][] grid, int k) {
        List<Integer> list = new ArrayList<>();
        int n = grid.length;
        int m = grid[0].length;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                list.add(grid[i][j]);
            }
        }

        int s = list.size();
        k = k % s;

        reverse(list, 0, s - k - 1);
        reverse(list, s - k, s - 1);
        reverse(list, 0, s - 1);
        List<List<Integer>> ans = new ArrayList<>();

        int idx = 0;
        for (int i = 0; i < n; i++) {
            List<Integer> row = new ArrayList<>();
            for (int j = 0; j < m; j++) {
                row.add(list.get(idx++));
            }
            ans.add(row);
        }

        return ans;
    }
}

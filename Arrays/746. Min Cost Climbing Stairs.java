class Solution {
    public int minCostClimbingStairs(int[] cost) {
        int n = cost.length;

        int next1 = 0;
        int next2 = 0;

        for (int i = n - 1; i >= 0; i--) {
            int current = cost[i] + Math.min(next1, next2);

            next2 = next1;
            next1 = current;
        }

        return Math.min(next1, next2);
    }
}

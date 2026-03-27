class Solution {
    public int maxDistToClosest(int[] seats) {
        int n = seats.length;
        int[] left = new int[n];
        int[] right = new int[n];

        int dist = n;
        for (int i = 0; i < n; i++) {
            if (seats[i] == 1) {
                dist = 0;
                left[i] = 0;
            } else {
                dist++;
                left[i] = dist;
            }
        }
        dist = n;
        for (int i = n - 1; i >= 0; i--) {
            if (seats[i] == 1) {
                dist = 0;
                right[i] = 0;
            } else {
                dist++;
                right[i] = dist;
            }
        }

        int maxiDist = Integer.MIN_VALUE;

        for (int i = 0; i < n; i++) {
            if (seats[i] == 0) {
                int currDist = Math.min(left[i], right[i]);
                maxiDist = Math.max(currDist, maxiDist);
            }
        }

        return maxiDist;
    }
}

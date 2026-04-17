class Solution {
    public int minMirrorPairDistance(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        int minDist = Integer.MAX_VALUE;

        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(nums[i])) {
                int prevIndex = map.get(nums[i]);
                int dist = i - prevIndex;
                if (dist < minDist) {
                    minDist = dist;
                }
            }

            int rev = reverse(nums[i]);
            map.put(rev, i);
        }

        if (minDist == Integer.MAX_VALUE) {
            return -1;
        }
        return minDist;
    }

    private int reverse(int n) {
        int rev = 0;
        boolean neg = false;

        if (n < 0) {
            neg = true;
            n = -n;
        }

        while (n > 0) {
            int r = n % 10;
            rev = rev * 10 + r;
            n = n / 10;
        }

        if (neg) {
            return -rev;
        }
        return rev;
    }
}

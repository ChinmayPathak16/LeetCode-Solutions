class Solution {
    private int gcd(int a, int b) {
        while (b != 0) {
            int t = b;
            b = a % b;
            a = t;
        }
        return a;
    }

    public long gcdSum(int[] nums) {
        int[] gcds = new int[nums.length];
        int maximum = nums[0];
        gcds[0] = nums[0];
        for (int i = 1; i < nums.length; i++) {
            maximum = Math.max(nums[i], maximum);
            gcds[i] = gcd(nums[i], maximum);
        }

        Arrays.sort(gcds);

        int n = gcds.length / 2;
        long res = 0;
        for (int i = 0; i < n; i++) {
            res = res + gcd(gcds[i], gcds[gcds.length - i - 1]);
        }
        return res;

    }
}

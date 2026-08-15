class Solution {
    public int[] getMaximumXor(int[] nums, int maximumBit) {
        int n = nums.length;
        int[] ans = new int[n];
        
        int xor = 0;
        for(int num : nums) {
            xor ^= num;
        }
        
        int mask = (1 << maximumBit) - 1;
        
        for(int i = 0; i < n; i++) {
            ans[i] = xor ^ mask;
            xor ^= nums[n - 1 - i];
        }
        
        return ans;
    }
}

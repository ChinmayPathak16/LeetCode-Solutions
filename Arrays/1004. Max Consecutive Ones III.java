class Solution {
    public int longestOnes(int[] nums, int k){
        int n = nums.length;
        int maxCount = 0;
        int left = 0;
        int cur = 0;
        int right = 0;
        while(right < n){
            while(cur <= k && right < n){
                if(nums[right] == 0)    cur++;
                right++;
            }
            maxCount = Math.max(maxCount, right - left - 1);
            while(cur > k){
                if(nums[left] == 0) cur--;
                left++;
            }
        }
        maxCount = Math.max(maxCount, right - left);
        return maxCount;
    }
}

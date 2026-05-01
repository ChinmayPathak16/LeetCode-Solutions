class Solution {
    public int maxRotateFunction(int[] nums) {
        int n = nums.length;
        int sum = 0;
        int fsum = 0;
        for(int i=0; i<n; i++){
            sum += nums[i];
            fsum = fsum + i*nums[i];
        }

        int maxSum = fsum;
        for(int i=1; i<n; i++){
            fsum = fsum + sum - n*nums[n-i];
            maxSum = Math.max(fsum, maxSum);
        }
        return maxSum;
    }
}

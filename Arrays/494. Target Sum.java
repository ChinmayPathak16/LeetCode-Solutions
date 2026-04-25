class Solution {
    public int findTargetSumWays(int[] nums, int target) {
        int n = nums.length;
        return sum(0,n,0,target,nums);
    }

    private int sum(int i, int n, int currSum, int target, int[] nums){
        if(i == n){
            if(target == currSum)   return 1;
            else    return 0;
        }

        return sum(i+1,n,currSum+nums[i],target,nums) + sum(i+1,n,currSum-nums[i],target,nums);
    }
}

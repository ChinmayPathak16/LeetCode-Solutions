class Solution {
    public int rob(int[] nums) {
        int n = nums.length;
        if(n == 1)  return nums[0];
        if(n == 2)  return Math.max(nums[0] , nums[1]);
        int[] house = new int[n];

        house[0] = nums[0];
        house[1] = Math.max(nums[0] , nums[1]);

        for(int i=2; i<nums.length; i++){
            house[i] = Math.max(house[i-2] + nums[i] , house[i-1]);
        }

        return house[nums.length - 1];
    }
}

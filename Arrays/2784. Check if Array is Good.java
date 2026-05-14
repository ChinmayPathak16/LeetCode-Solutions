class Solution {
    public boolean isGood(int[] nums) {
        Arrays.sort(nums);
        boolean isGood = false;
        int n = nums.length;
        int target = n-1;
        if(nums[n-1] == target && nums[n-2] == target){
            isGood = true;
        }
        for(int i=0; i<n-2; i++){
            if(nums[i] != i+1){
                return false;
            }
        }
        return isGood;
    }
}

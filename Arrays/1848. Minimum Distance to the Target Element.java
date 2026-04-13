class Solution {
    public int getMinDistance(int[] nums, int target, int start) {
        int minValue = Integer.MAX_VALUE;
        for(int i=0;i<nums.length;i++){
            if(nums[i] == target){
                minValue = Math.min(minValue,Math.abs(i-start));
            }
        }
        return minValue;
    }
}

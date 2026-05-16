class Solution {
    public int[] maxValue(int[] nums) {

        int n = nums.length;
        int[] rightMin = new int[n];
        int[] leftMax = new int[n];
        int[] ans = new int[n];

        leftMax[0] = nums[0];
        for(int i=1; i<n; i++){
            leftMax[i] = Math.max(leftMax[i-1] , nums[i]);
        }

        rightMin[n-1] = nums[n-1];
        for(int i=n-2; i>=0; i--){
            rightMin[i] = Math.min(rightMin[i+1] , nums[i]);
        }
        ans[n-1] = leftMax[n-1];
        for(int i=n-2; i>=0; i--){
            if(leftMax[i] <= rightMin[i+1]){
                ans[i] = leftMax[i];
            }
            else{
                ans[i] = ans[i+1];
            }
        }
        return ans;
    }
}

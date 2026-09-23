class Solution {
    public int minOperations(int[] nums, int x) {
        if(nums[0] > x && nums[nums.length-1] > x)  return -1;
        int sum = 0;
        int n = nums.length;
        
        for(int i=0; i<n; i++){
            sum += nums[i];
        }

        int target = sum - x;
        int curr_sum = 0;
        

        if(target == 0) return n;
        
        int left = 0;
        int right = 0;
        int minEle = Integer.MAX_VALUE;

        while(right < n){
            
            curr_sum += nums[right];
            
            while(curr_sum > target && left <= right){
                curr_sum -= nums[left];
                left++;
            }
            if(curr_sum == target){
                int ele = right - left + 1;
                minEle = Math.min(minEle, n-ele);
            }

            right++;
        }
        if(minEle == Integer.MAX_VALUE) return -1;
        return minEle;
    }
}

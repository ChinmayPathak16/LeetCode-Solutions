class Solution {
    public int largestInteger(int[] nums, int k) {
        int[] arr = new int[51];

        if(k == 1){
            for(int i=0; i<nums.length; i++){
                arr[nums[i]]++;
            }
            for(int i=arr.length-1; i>=0; i--){
                if(arr[i] == 1) return i;
            }
        }
        else if(k == nums.length){
            int maxEle = nums[0];
            for(int x: nums){
                maxEle = Math.max(x,maxEle);
            }
            return maxEle;
        }
        else{
            int a = nums[0];
            int b = nums[nums.length-1];
            int cnt1 = 0;
            int cnt2 = 0;
            for(int x: nums){
                if(a==x)    cnt1++;
                if(b==x)    cnt2++;
            }
            if(cnt1 == 1 && cnt2 == 1)  return Math.max(a,b);
            if(cnt1 == 1)   return a;
            if(cnt2 == 1)   return b;
        }
        return -1;
    }
}

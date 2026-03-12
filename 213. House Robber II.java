class Solution {
    public int rob(int[] nums) {
        if(nums.length == 1)    return nums[0];
        if(nums.length == 2)    return Math.max(nums[0],nums[1]);

        int[] nums1 = new int[nums.length-1];
        int[] nums2 = new int[nums.length-1];

        for(int i=0;i<nums.length-1;i++){
            nums1[i] = nums[i];
        }
        int j = 0;
        for(int i=nums.length-1;i>=1;i--){
            nums2[j] = nums[i];
            j++;
        }

        int skip_first = robbery(nums1);

        int skip_last = robbery(nums2);

        return Math.max(skip_first,skip_last);
        
    }

    private int robbery(int[] nums){
        int[] house = new int[nums.length];
        if(nums.length == 1)    return nums[0];
        if(nums.length == 2)    return Math.max(nums[0],nums[1]);

        house[0] = nums[0];
        house[1] = Math.max(nums[0],nums[1]);

        for(int i=2;i<nums.length;i++){
            house[i] = Math.max(house[i-2] + nums[i] , house[i-1]);
        }

        return house[nums.length - 1];
    }
}

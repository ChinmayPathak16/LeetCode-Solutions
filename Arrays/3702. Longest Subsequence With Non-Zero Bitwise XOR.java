class Solution {

    public int longestSubsequence(int[] nums) {
        int res = 0;
        boolean nonZero = false;
        for(int x: nums){
            res = res ^ x;
            if(x != 0){
                nonZero = true;
            }
        }
        if(res != 0) return nums.length;
        if(nonZero == true) return nums.length-1;
        return 0;
    }
}

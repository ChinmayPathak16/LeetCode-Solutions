class Solution {
    public int uniqueXorTriplets(int[] nums) {
        int pow = nums.length;
        if(pow <= 2)    return pow;
        int res = 1;
        while(res <= pow){
            res <<= 1;
        }
        return res;
    }
}

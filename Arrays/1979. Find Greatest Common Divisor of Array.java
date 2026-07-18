class Solution {
    private int gcd(int a, int b){
        while(b!=0){
            int t = b;
            b = a%b;
            a = t;
        }
        return a;
    }
    public int findGCD(int[] nums) {
        int maxEle = Integer.MIN_VALUE;
        int minEle = Integer.MAX_VALUE;

        for(int i=0; i<nums.length; i++){
            maxEle = Math.max(maxEle, nums[i]);
            minEle = Math.min(minEle, nums[i]);
        }

        return gcd(maxEle,minEle);
    }
}

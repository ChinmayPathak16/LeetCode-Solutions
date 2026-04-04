class Solution {
    public int maxGoodNumber(int[] nums) {
        String[] ans = new String[nums.length];
        for(int i=0; i<nums.length; i++){
            ans[i] = Integer.toBinaryString(nums[i]);
        }
        Arrays.sort(ans , (a,b)->{
            return (b+a).compareTo(a+b);
        });
        StringBuilder sb = new StringBuilder();
        for(int i=0; i<nums.length; i++){
            sb.append(ans[i]);
        }
        return Integer.parseInt(sb.toString(),2);
    }
}

class Solution {
    public int subarraySum(int[] nums, int k) {
        int sum = 0;
        HashMap<Integer,Integer> map = new HashMap<>();
        map.put(sum,map.getOrDefault(sum,0)+1);
        int count = 0;
        for(int i=0; i<nums.length; i++){
            sum += nums[i];
            int diff = sum - k;
            count += map.getOrDefault(diff,0);
            map.put(sum,map.getOrDefault(sum,0)+1);
        }
        return count;
    }
}

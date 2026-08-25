class Solution {
    public int missingMultiple(int[] nums, int k) {
        Set<Integer> set = new HashSet<>();
        for(int x: nums){
            set.add(x);
        }
        int mul = k;
        for(int i = 1; i<Integer.MAX_VALUE; i++){
            if(!set.contains(mul)){
                return mul;
            }
            mul = k*i;
        }
        return -1;
    }
}

class Solution {
    public List<Integer> solveQueries(int[] nums, int[] queries) {
        Map<Integer, Integer> hm = new HashMap<>();
        for(int i=0; i<nums.length; i++){
            hm.put(nums[i], hm.getOrDefault(nums[i], 0)+1);
        }

        List<Integer> list = new ArrayList<>();
        for(int i=0; i<queries.length; i++){
            int s = queries[i];
            int ele = nums[s];
            if(hm.get(ele) < 2){
                list.add(-1);
                continue;
            }
            int dist = Integer.MAX_VALUE;
            int n = nums.length;

            for(int j=0; j<nums.length; j++){
                if(s == j)  continue;
                if(nums[j] == ele){
                    int curDist = Math.min((s-j+n)%n , (j-s+n)%n);
                    dist = Math.min(dist, curDist);
                }
            }
            list.add(dist);
        }

        return list;
    }
}

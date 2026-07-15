class Solution {
    public int[] arrayRankTransform(int[] arr) {
        int[] nums = arr.clone();
        Arrays.sort(nums);

        HashMap<Integer, Integer> map = new HashMap<>();
        int rank = 1;

        for (int num : nums) {
            if (!map.containsKey(num)) {
                map.put(num, rank++);
            }
        }

        int[] res = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            res[i] = map.get(arr[i]);
        }

        return res;
    }
}

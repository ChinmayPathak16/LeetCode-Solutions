class Solution {
    public List<List<Integer>> findSubsequences(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        backtrack(nums, 0, new ArrayList<>(), res);
        return res;
    }

    private void backtrack(int[] nums, int index, List<Integer> curr, List<List<Integer>> res) {
        if (curr.size() >= 2) {
            res.add(new ArrayList<>(curr));
        }

        HashSet<Integer> used = new HashSet<>();

        for (int i = index; i < nums.length; i++) {
            if (used.contains(nums[i])) continue;

            if (curr.size() == 0 || nums[i] >= curr.get(curr.size() - 1)) {
                used.add(nums[i]);
                curr.add(nums[i]);
                backtrack(nums, i + 1, curr, res);
                curr.remove(curr.size() - 1);
            }
        }
    }
}

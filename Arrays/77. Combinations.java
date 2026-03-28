class Solution {
    public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> list = new ArrayList<>();
        backtracking(1, n, k, new ArrayList<>(), list);
        return list;
    }

    private void backtracking(int start, int n, int k, List<Integer> curr, List<List<Integer>> list){
        if(curr.size() == k){
            list.add(new ArrayList<>(curr));
            return;
        }

        for(int i = start; i <= n; i++){
            curr.add(i);
            backtracking(i + 1, n, k, curr, list);
            curr.remove(curr.size() - 1);
        }
    }
}

class Solution {
    public List<String> validStrings(int n) {
        List<String> ans = new ArrayList<>();
        backtracking(n, "", ans);
        return ans;
    }

    private void backtracking(int n, String s, List<String> ans){
        if(s.length() == n){
            ans.add(s);
            return;
        }
        backtracking(n, s+"1", ans);
        if(s.length() == 0 || s.charAt(s.length() - 1) != '0'){
            backtracking(n, s+"0", ans);
        }
    }
}

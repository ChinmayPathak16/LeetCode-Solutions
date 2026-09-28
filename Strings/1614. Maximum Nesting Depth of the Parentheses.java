class Solution {
    public int maxDepth(String s) {
        int cnt = 0;
        int n = s.length();
        int i=0;
        int max_cnt = 0;
        while(i < n){
            if(s.charAt(i) == '('){
                cnt++;
            }
            else if(s.charAt(i) == ')'){
                cnt--;
            }
            max_cnt = Math.max(max_cnt, cnt);
            i++;
        }
        return max_cnt;
    }
}

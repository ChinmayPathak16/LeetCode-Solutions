class Solution {
    private boolean checkPali(String s, int left, int right){
        int l = left;
        int r = right;
        while(l<r){
            if(s.charAt(l) != s.charAt(r))  return false;
            l++;
            r--;
        }

        return true;
    }
    private int getDivs(String s, int start, int n, int[] dp){
        if(start == n)  return 0;
        if(dp[start] != -1){
            return dp[start];
        }
        int minDivs = Integer.MAX_VALUE;
        for(int end = n-1; end >=start; end--){
            if(checkPali(s, start, end)){
                int divs = 1 + getDivs(s, end+1, n, dp);
                minDivs = Math.min(minDivs, divs);
            }
        }
        return dp[start] = minDivs;
    }
    public int minCut(String s) {
        int n = s.length();
        int[] dp = new int[n];
        Arrays.fill(dp,-1);
        return getDivs(s, 0, n, dp) - 1;
    }
}

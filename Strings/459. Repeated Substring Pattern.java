class Solution {
    public boolean repeatedSubstringPattern(String s) {
        int n = s.length();
        boolean res = false;
        int i = 1;
        while(i <= n/2){
            if(n%i != 0){   i++; continue;}
            String sub = s.substring(0,i);
            String ans = "";
            while(ans.length() < s.length()){
                ans += sub;
            }
            if(ans.equals(s))   return true;
            i++;
        }
        return false;
    }
}

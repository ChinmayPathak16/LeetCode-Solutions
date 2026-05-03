class Solution {
    public boolean rotateString(String s, String goal) {
        if(s.length() != goal.length()) return false;
        int n = s.length();
        s = s+s;
        for(int i=0; i<s.length() - n; i++){
            if(goal.equals(s.substring(i,n+i)))   return true;
        }
        return false;
    }
}

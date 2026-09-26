class Solution {
    public boolean scoreBalance(String s) {
        char A = 'a';
        int p = (int)A; p--;
        int sum = 0;
        for(int i=0; i<s.length(); i++){
            char ch = s.charAt(i);
            sum += ((int)ch  - p);
        }
        if(sum%2 != 0)  return false;
        int cur = 0;
        int i=0;
        while(i < s.length()){
            char ch = s.charAt(i);
            cur += ((int)ch - p);
            if(cur == sum/2)  return true;
            i++;
        }
        return false;
    }
}

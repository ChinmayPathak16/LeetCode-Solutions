class Solution {
    public boolean isStrictlyPalindromic(int n) {
        if(n < 2)   return true;
        for(int i=2; i<=n-2; i++){
            boolean palindrome = checkPalindrome((getBaseToN(n , i)));       
            if(!palindrome) return palindrome;
        }
        return true;
    }

    private String getBaseToN(int n, int base){
        StringBuilder sb = new StringBuilder();
        while(n > 0){
            int r = n % base;
            n /= base;
            sb.append(r);
        }
        return sb.toString();
    }

    private boolean checkPalindrome(String s){
        int n = s.length();
        if(n == 0)  return true;
        int l = 0;
        int r = n-1;
        while(l < r){
            if(s.charAt(l) != s.charAt(r))  return false;
            l++;
            r--;
        }
        return true;
    }
}

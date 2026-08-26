class Solution {
    public String shortestBeautifulSubstring(String s, int k) {
        int cnt = 0;
        int right = 0;
        int left = 0;
        String res = "";
        while(right < s.length()){
            
            if(s.charAt(right) == '1'){
                cnt++;
            }

            
            while(cnt > k){
                if(s.charAt(left) == '1')  cnt--;
                left++;
            }
            while(s.charAt(left) == '0' && cnt == k)    left++;

            if(cnt == k){
                 String curr = s.substring(left, right + 1);

                if (res.equals("") || curr.length() < res.length() || (curr.length() == res.length() && curr.compareTo(res) < 0)) {
                    res = curr;
                }
            }
            right++;
        }
        return res;
    }
}

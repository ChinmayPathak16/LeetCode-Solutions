class Solution {
    public int minFlips(String s) {
        int n = s.length();
        s = s + s;

        int alt1 = 0;
        int alt2 = 0;
        int res = Integer.MAX_VALUE;

        for(int i = 0; i < s.length(); i++){

            char c1 = (i % 2 == 0) ? '0' : '1';
            char c2 = (i % 2 == 0) ? '1' : '0';

            if(s.charAt(i) != c1) alt1++;
            if(s.charAt(i) != c2) alt2++;

            if(i >= n){
                char p1 = ((i-n) % 2 == 0) ? '0' : '1';
                char p2 = ((i-n) % 2 == 0) ? '1' : '0';

                if(s.charAt(i-n) != p1) alt1--;
                if(s.charAt(i-n) != p2) alt2--;
            }

            if(i >= n-1){
                res = Math.min(res, Math.min(alt1, alt2));
            }
        }

        return res;
    }
}

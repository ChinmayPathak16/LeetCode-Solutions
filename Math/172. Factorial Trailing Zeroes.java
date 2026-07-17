class Solution {
    public int trailingZeroes(int n) {
        int res = 0;
        int d = 5;
        while(n/d > 0){
            res += n/d;
            d *= 5;
        }
        return res;
    }
}

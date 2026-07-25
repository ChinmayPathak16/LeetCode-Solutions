class Solution {
    public int maxProduct(int n) {
        int fmax = 0;
        int smax = 0;

        while(n > 0){
            if(fmax == 9 && smax == 9){
                break;
            }
            int d = n%10;
            if(fmax <= d){
                smax = fmax;
                fmax = d;
            }
            else if(smax < d){
                smax = d;
            }
            n /= 10;
        }
        return smax*fmax;
    }
}

class Solution {
    private long getSum(int n){
        long sum = 0;
        while(n != 0){
            int d = n%10;
            n /= 10;
            sum += d;
        }
        return sum;
    }
    private int reverse(int n){
        int num = 0;
        while(n!= 0){
            int d = n%10;
            n /= 10;
            if(d == 0){
                continue;
            }
            num = num*10 + d;
        }
        return num;
    }
    public long sumAndMultiply(int n) {
        int x = reverse(n);
        x = reverse(x);
        long sum = getSum(x);
        return (long)x * sum;
    }
}

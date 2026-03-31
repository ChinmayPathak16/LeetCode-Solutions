class Solution {
    public int minOperations(int n) {
        int sum = 0;
        for(int i=0; i<=n/2; i++){
            sum = sum + (2*i - 1);
        }

        if(n%2 == 0)    return sum + 1;
        return sum + (n/2) + 1;
    }
}

class Solution {
    public int candy(int[] rat) {
        int n = rat.length;
        int[] can = new int[n];
        for(int i=0; i<n; i++){
            can[i] = 1;
        }

        for(int i=1; i<n; i++){
            if(rat[i] > rat[i-1]){
                can[i] = can[i-1] + 1;;
            }
        }

        for(int i=n-2; i>=0; i--){
            if(rat[i] > rat[i+1]){
                can[i] = Math.max(can[i], can[i+1]+1);
            }
        }

        int sum = 0;
        for(int c: can){
            sum += c;
        }

        return sum;
    }
}

class Solution {
    public int[] minOperations(String boxes) {
        int n = boxes.length();
        int[] ops = new int[n];
        int cnt = 0;
        for(int i=0; i<n; i++){
            if(i > 0){
                ops[i] = ops[i-1] + cnt;
            }
             
            if(boxes.charAt(i) == '1'){
                cnt++;
            }
        }

        int[] help = new int[n];
        cnt = 0;
        for(int i=n-1; i>=0; i--){
            if(i < n-1){
                help[i] = help[i+1] + cnt;
            }

            if(boxes.charAt(i) == '1'){
                cnt++;
            }
        }

        for(int i=0; i<n; i++){
            ops[i] = ops[i] + help[i];
        }

        return ops;
    }
}

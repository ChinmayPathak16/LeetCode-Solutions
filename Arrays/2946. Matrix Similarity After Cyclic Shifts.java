class Solution {
    public boolean areSimilar(int[][] mat, int k) {
        int n = mat.length;
        int m = mat[0].length;
        k %= m;
        if(k == 0)  return true;
        int[][] rep = new int[n][m];

        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                rep[i][j] = mat[i][j]; 
            }
        }

        for(int i=0; i<n; i++){
            if(i%2 == 0){
                //left shift
                shift(rep[i], 0, k-1, k, m-1);
            }
            else{
                //right shift
                int rk = m - k;
                shift(rep[i], 0, rk-1, rk, m-1);
            }
        }

        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                if(rep[i][j] != mat[i][j])  return false;
            }
        }
        return true;
    }

    private static void shift(int[] arr, int s1, int e1, int s2, int e2){
        reverse(arr, s1, e1);
        reverse(arr, s2, e2);
        reverse(arr, s1, e2);
    }

    private static void reverse(int[] arr, int start, int end){
        while(start <= end){
            int t = arr[start];
            arr[start] = arr[end];
            arr[end] = t;
            start++;
            end--;
        }
    }
}

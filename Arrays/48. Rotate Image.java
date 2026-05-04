class Solution {
    private void reverse(int[] arr){
        int right = arr.length - 1;
        int left = 0;
        while(left < right){
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            right--;
            left++;
        }
    }
    public void rotate(int[][] mat) {
        int n = mat.length;
        int m = mat[0].length;
        int k=0;
        for(int i=0;i<n;i++){
            for(int j=0;j<=k && k<m;j++){
                int temp = mat[i][j];
                mat[i][j] = mat[j][i];
                mat[j][i] = temp;
            }
            k++;
        }
        for(int i=0;i<n;i++){
            reverse(mat[i]);
        }
        return;
    }
}

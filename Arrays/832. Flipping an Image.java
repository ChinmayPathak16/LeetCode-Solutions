class Solution {
    public int[][] flipAndInvertImage(int[][] image) {

        int n = image.length;
        int[][] res = new int[n][n];
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                res[i][n-1-j] = (image[i][j] + 1)%2;
            }
        }
        return res;
    }
}

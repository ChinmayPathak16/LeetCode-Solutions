class Solution {
    public int findMinArrowShots(int[][] pts) {
        Arrays.sort(pts, (a, b) -> Integer.compare(a[1], b[1]));
        int point = pts[0][1];
        int count = 1;

        for(int i=1; i<pts.length; i++){
            if(pts[i][0] > point){
                count++;
                point = pts[i][1];
            }
        }
        return count;
    }
}

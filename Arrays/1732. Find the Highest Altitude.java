class Solution {
    public int largestAltitude(int[] gain) {
        int alti = 0;
        int highestAlti = 0;
        int currAlti = 0;
        for(int i=0; i<gain.length; i++){
            currAlti += gain[i];
            highestAlti = Math.max(currAlti, highestAlti);
        }
        return highestAlti;
    }
}

class Solution {
    public int findMinDifference(List<String> timePoints) {
        Collections.sort(timePoints);

        int minDiff = Integer.MAX_VALUE;
        for(int i=0; i<timePoints.size() - 1; i++){
            String s1 = timePoints.get(i);
            String s2 = timePoints.get(i+1);

            int t1 = Integer.parseInt(s1.substring(0,2)) *60 + Integer.parseInt(s1.substring(3,5));
            int t2 = Integer.parseInt(s2.substring(0,2)) *60 + Integer.parseInt(s2.substring(3,5));

            int currTime = t2-t1;
            minDiff = Math.min(minDiff, currTime);
        }

        //for 1st and last element -->

        String s1 = timePoints.get(0);
        String s2 = timePoints.get(timePoints.size() - 1);

        int t1 = Integer.parseInt(s1.substring(0,2)) *60 + Integer.parseInt(s1.substring(3,5));
        int t2 = Integer.parseInt(s2.substring(0,2)) *60 + Integer.parseInt(s2.substring(3,5));

        int timeDiff1 = Math.abs(t1-t2);
        int timeDiff2 = Math.abs(1440-timeDiff1);
        minDiff = Math.min(minDiff, Math.min(timeDiff1 ,timeDiff2));
        return minDiff;
    }
}

class Solution {
    public int countDaysTogether(String aA, String lA, String aB, String lB) {
        String start = "";
        if(aA.compareTo(aB) >= 0) {
            start=aA;
        }
        else{
            start=aB;
        }

        String end = "";
        if(lA.compareTo(lB) <= 0) {
            end = lA;
        }
        else{
            end = lB;
        }

        if(start.compareTo(end) > 0) {
            return 0;
        }

        int[] months = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        int m1 = Integer.parseInt(start.substring(0, 2));
        int d1 = Integer.parseInt(start.substring(3, 5));
        int m2 = Integer.parseInt(end.substring(0, 2));
        int d2 = Integer.parseInt(end.substring(3, 5));
        int res = 0;
        if (m1 == m2) {
            return d2 - d1 + 1;
        }
        res += months[m1 - 1] - d1 + 1;
        for (int i=m1+1; i<m2; i++) {
            res += months[i-1];
        }
        res += d2;
        return res;
    }
}

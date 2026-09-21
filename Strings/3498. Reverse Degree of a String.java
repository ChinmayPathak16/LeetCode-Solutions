class Solution {
    public int reverseDegree(String s) {
        int index = (int) 'z';
        index++;
        int res = 0;
        int n = s.length();
        for(int i=0; i<n; i++){
            int value = Math.abs(index - (int) s.charAt(i));
            value *= (i+1);
            res += value;
        }
        return res;
    }
}

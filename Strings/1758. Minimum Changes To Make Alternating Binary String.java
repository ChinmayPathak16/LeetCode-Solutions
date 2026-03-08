class Solution {
    public int minOperations(String s) {

        int alt1 = 0;
        int alt2 = 0;

        for(int i = 0; i < s.length(); i++){

            char expected1 = (i % 2 == 0) ? '0' : '1';
            char expected2 = (i % 2 == 0) ? '1' : '0';

            if(s.charAt(i) != expected1) alt1++;
            if(s.charAt(i) != expected2) alt2++;
        }

        return Math.min(alt1, alt2);
    }
}

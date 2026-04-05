class Solution {
    public boolean judgeCircle(String moves) {
        int cntU = 0;
        int cntD = 0;
        int cntL = 0;
        int cntR = 0;
        for(int i=0; i<moves.length(); i++){
            if(moves.charAt(i) == 'U')  cntU++;
            else if(moves.charAt(i) == 'D')  cntD++;
            else if(moves.charAt(i) == 'L')  cntL++;
            else if(moves.charAt(i) == 'R')  cntR++;
        }

        if(cntU == cntD && cntR == cntL)    return true;
        return false;
    }
}

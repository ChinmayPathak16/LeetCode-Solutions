class Solution {
    public int rotatedDigits(int n) {
        int count=0;
        for(int i=1; i<=n; i++) {
            int x = i;
            boolean hasChange = false;
            boolean isValid = true;
            while(x>0) {
                int d = x%10;
                if(d==3 || d==4 || d==7) {
                    isValid=false;
                    break;
                }
                if(d==2 || d==5 || d==6 || d==9) {
                    hasChange=true;
                }
                x/=10;
            }
            if(isValid && hasChange) count++;
        }
        return count;
    }
}

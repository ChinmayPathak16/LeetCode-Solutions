class Solution {
    public boolean lemonadeChange(int[] bills) {
        int n = bills.length;
        int cnt5 = 0;
        int cnt10 = 0;
        int cnt20 = 0;

        for(int i=0; i<n; i++){
            if(bills[i] == 5)   cnt5++;
            else if(bills[i] == 10){
                if(cnt5 < 1)    return false;
                else{
                    cnt5--;
                    cnt10++;
                }
            }
            else if(bills[i] == 20){
                if(cnt10 > 0 && cnt5 < 1)   return false;
                else if(cnt10 < 1 && cnt5 < 3)  return false;
                else if(cnt10 > 0 && cnt5 > 0){
                    cnt5--;
                    cnt10--;
                    cnt20++;
                }
                else if(cnt10 < 1 && cnt5 >= 3){
                    cnt5 = cnt5-3;
                    cnt20++;
                }
            }
            
        }
        return true;
    }
}

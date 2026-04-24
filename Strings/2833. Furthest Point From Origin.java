class Solution {
    public int furthestDistanceFromOrigin(String moves) {
        int l = 0;
        int r = 0;
        int s = 0;

        for(int i=0; i<moves.length(); i++){
            if(moves.charAt(i) == 'L')  l++;
            else if(moves.charAt(i) == 'R') r++;
            else    s++;
        }

        if(l > r)   l = l + s;
        else    r = r + s;

        int dist = 0;
        for(int i=0; i<moves.length(); i++){
            if(moves.charAt(i) == 'L'){
                dist--;
            }
            else if(moves.charAt(i) == 'R'){
                dist++;
            }
            else{
                if(r > l){
                    dist++;
                }
                else{
                    dist--;
                }
            }
        }

        return Math.abs(dist);
    }
}

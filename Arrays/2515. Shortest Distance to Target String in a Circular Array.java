class Solution {
    public int closestTarget(String[] words, String target, int s) {
        int n = words.length;
        int dist = Integer.MAX_VALUE;
        for(int i=0; i<n; i++){
            if(target.equals(words[i])){
                int curDist = Math.min((s-i+n)%n, (i-s+n)%n);
                dist = Math.min(dist,curDist);
            }
        }
        if(dist == Integer.MAX_VALUE)   return -1;
        return dist;
    }
}

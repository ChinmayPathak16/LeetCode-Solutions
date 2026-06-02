class Solution {
    public int earliestFinishTime(int[] lst, int[] ld, int[] wst, int[] wd) {
        int time = Integer.MAX_VALUE;

        //lst first
        for(int i=0; i<lst.length; i++){
            for(int j=0; j<wst.length; j++){
                int currentTime = lst[i] + ld[i];
                if(currentTime < wst[j]){
                    currentTime = wst[j];
                }
                currentTime += wd[j];
                time = Math.min(time, currentTime);
            }
        }

        //wst first
        for(int i=0; i<wst.length; i++){
            for(int j=0; j<lst.length; j++){
                int currentTime = wst[i] + wd[i];
                if(currentTime < lst[j]){
                    currentTime = lst[j];
                }
                currentTime += ld[j];
                time = Math.min(time, currentTime);
            }
        }

        return time;
    }
}

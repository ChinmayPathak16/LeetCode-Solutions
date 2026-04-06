class Solution {
    public int robotSim(int[] com, int[][] obst) {

        Set<String> set = new HashSet<>();
        for(int[] obs: obst){
            set.add(obs[0] + " " + obs[1]);
        }

        ArrayList<Character> list = new ArrayList<>();
        list.add('n');
        list.add('e');
        list.add('s');
        list.add('w');

        int n = list.size();
        int dir = 0;
        char curDir = list.get(dir); 

        int x = 0, y = 0;
        int maxDist = 0;

        for(int i=0; i<com.length; i++){

            if(com[i] == -1){
                dir = (dir + 1) % n;
                curDir = list.get(dir);
                continue;
            }

            if(com[i] == -2){
                dir = (dir - 1 + n) % n;
                curDir = list.get(dir);
                continue;
            }

            for(int j=0; j<com[i]; j++){

                if(curDir == 'n'){
                    if(set.contains(x + " " + (y+1))) break;
                    y++;
                }
                else if(curDir == 'e'){
                    if(set.contains((x+1) + " " + y)) break;
                    x++;
                }
                else if(curDir == 's'){
                    if(set.contains(x + " " + (y-1))) break;
                    y--;
                }
                else{
                    if(set.contains((x-1) + " " + y)) break;
                    x--;
                }

                maxDist = Math.max(maxDist, x*x + y*y);
            }
        }

        return maxDist;
    }
}

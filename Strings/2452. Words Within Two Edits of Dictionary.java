class Solution {
    public List<String> twoEditWords(String[] queries, String[] dictionary) {
        List<String> list = new ArrayList<>();
        for(int i=0; i<queries.length; i++){
            int n = queries[i].length();
            boolean added = false;
            for(int j=0; j<dictionary.length; j++){
                int m = dictionary[j].length();
                if(n == m){
                    int diff = 0;
                    for(int k=0; k<m; k++){
                        if(dictionary[j].charAt(k) != queries[i].charAt(k)){
                            diff++;
                        }
                    }
                    if(diff <= 2 && !added){
                        list.add(queries[i]);
                        added = true;
                        break;
                    }
                }
            }
        }
        return list;
    }
}

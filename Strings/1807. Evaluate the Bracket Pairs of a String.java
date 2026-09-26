class Solution {
    public String evaluate(String s, List<List<String>> knowledge) {
        HashMap<String,String> map = new HashMap<>();

        int n = knowledge.size();
        for(int i=0; i<n; i++){
            map.put(knowledge.get(i).get(0), knowledge.get(i).get(1));
        }
        
        int i = 0;
        StringBuilder res = new StringBuilder();
        while(i < s.length()){
            if(s.charAt(i) == '('){
                i++;
                StringBuilder ele = new StringBuilder();
                while(s.charAt(i) != ')'){
                    ele.append(s.charAt(i));
                    i++;
                }
                String help = ele.toString();
                if(map.containsKey(help)){
                    res.append(map.get(help));
                }
                else{
                    res.append("?");
                }
            }
            else{
                res.append(s.charAt(i));
            }
            i++;
        }
        return res.toString();
    }
}

class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        if(p.length() > s.length()){
            return new ArrayList<Integer>();
        }
        HashMap<Character, Integer> map1 = new HashMap<>();
        int n = p.length();

        for(int i=0; i<n; i++){
            map1.put(p.charAt(i),map1.getOrDefault(p.charAt(i), 0)+1);
        }

        HashMap<Character, Integer> map2 = new HashMap<>();
        ArrayList<Integer> res = new ArrayList<>();

        for(int i=0; i<n; i++){
            map2.put(s.charAt(i),map2.getOrDefault(s.charAt(i), 0)+1);
        }
        if(map1.equals(map2)){
            res.add(0);
        }

        int m = s.length();
        for(int i=1; i<=m-n; i++){
            char ch = s.charAt(i-1);
            map2.put(ch, map2.get(ch) - 1);

            if(map2.get(ch) == 0){
                map2.remove(ch);
            }

            char ele = s.charAt(i+n-1);
            map2.put(ele, map2.getOrDefault(ele,0)+1);
            if(map1.equals(map2)){
                res.add(i);
            }
        }

        return res;
    }
}

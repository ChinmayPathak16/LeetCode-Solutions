class Solution {
    public boolean checkStrings(String s1, String s2) {
        if(s1.length() != s2.length())  return false;
        HashMap<Character, Integer> map = new HashMap<>();
        for(int i=0; i<s1.length(); i+=2){
            map.put(s1.charAt(i), map.getOrDefault(s1.charAt(i),0)+1);
        }
        for(int i=0; i<s2.length(); i+=2){
            char ch = s2.charAt(i);
            if(map.getOrDefault(ch,0)==0){
                return false;
            }
            map.put(ch,map.get(ch) - 1);
            if(map.get(ch) == 0){
                map.remove(ch);
            }
        }

        if(!map.isEmpty()){
            return false;
        }

        for(int i=1; i<s1.length(); i+=2){
            map.put(s1.charAt(i), map.getOrDefault(s1.charAt(i),0)+1);
        }
        for(int i=1; i<s2.length(); i+=2){
            char ch = s2.charAt(i);
            if(map.getOrDefault(ch,0)==0){
                return false;
            }
            map.put(ch,map.get(ch) - 1);
            if(map.get(ch) == 0){
                map.remove(ch);
            }
        }
        if(!map.isEmpty()){
            return false;
        }
        return true;
    }
}

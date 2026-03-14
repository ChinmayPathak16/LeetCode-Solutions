class Solution {
    public static char[] chars= {'a','b','c'};
    public String getHappyString(int n, int k) {
        ArrayList<String> list = new ArrayList<>();
        response("",n,list);
        if(k > list.size())    return "";
        return list.get(k-1);
    }
    private void response(String s, int n, ArrayList<String> list){
        if(s.length() == n){
            list.add(s);
            return;
        }
        for(char ch: chars){
            if(s.length() > 0 && s.charAt(s.length() - 1) == ch){
                continue;
            }
            response(s + ch, n, list);
        }
    }
}

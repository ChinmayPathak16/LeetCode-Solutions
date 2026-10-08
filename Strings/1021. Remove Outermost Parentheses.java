class Solution {
    public String removeOuterParentheses(String s) {
        int cnt = 0;
        int start = 0;
        StringBuilder sb = new StringBuilder();
        for(int i=0; i<s.length(); i++){
            char ch = s.charAt(i);
            if(ch == '('){
                cnt++;
                if(start != i){
                    sb.append(ch);
                }
            }
            if(ch == ')'){
                cnt--;
                if(cnt == 0){
                    start = i+1;
                }
                else{
                    sb.append(ch);
                }
            }
        }
        return sb.toString();
    }
}

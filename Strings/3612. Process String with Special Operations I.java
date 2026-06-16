class Solution {
    public String processStr(String s) {
        StringBuilder result = new StringBuilder();

        for(int i=0; i<s.length(); i++){
            if(s.charAt(i) == '#'){
                result.append(result.toString());
            }
            else if(s.charAt(i) == '*'){
                if(result.length() > 0){
                    result.deleteCharAt(result.length()-1);
                }
            }
            else if(s.charAt(i) == '%'){
                result.reverse();
            }

            else{
                result.append(s.charAt(i));
            }
        }
        return result.toString();
    }
}

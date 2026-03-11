class Solution {
    public int bitwiseComplement(int n) {
        String b = Integer.toBinaryString(n);
        String s = "";
        for(int i=0;i<b.length();i++){
            if(b.charAt(i) == '0'){
                s += "1";
            }
            else{
                s += "0";
            }
        }
        return Integer.parseInt(s,2);
    }
}

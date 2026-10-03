class Solution {
    public String removeTrailingZeros(String num) {
        StringBuilder sb = new StringBuilder();
        int i = num.length() - 1;
        while(num.charAt(i) == '0' && i >= 0){
            i--;
        }

        for(int j=0; j<=i; j++){
            sb.append(num.charAt(j));
        }

        return sb.toString();
    }
}

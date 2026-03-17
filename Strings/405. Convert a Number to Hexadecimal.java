class Solution {
    public String toHex(int num) {
        if (num == 0) return "0";
        
        char[] hex = "0123456789abcdef".toCharArray();
        StringBuilder result = new StringBuilder();
        
        while (num != 0) {
            result.append(hex[num & 15]); // get last 4 bits
            num >>>= 4; // unsigned right shift by 4 bits
        }
        
        return result.reverse().toString();
    }
}

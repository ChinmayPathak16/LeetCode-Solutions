class Solution {
    public String decodeCiphertext(String ecT, int rows) {
        if (rows == 1) return ecT;

        int n = ecT.length();
        int cols = n / rows;

        StringBuilder sb = new StringBuilder();

        for (int j = 0; j < cols; j++) {
            int i = 0, col = j;

            while (i < rows && col < cols) {
                sb.append(ecT.charAt(i * cols + col));
                i++;
                col++;
            }
        }

        // remove trailing spaces
        int end = sb.length() - 1;
        while (end >= 0 && sb.charAt(end) == ' ') {
            end--;
        }

        return sb.substring(0, end + 1);
    }
}

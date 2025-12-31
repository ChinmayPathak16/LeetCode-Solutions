class Solution {
    public int bestClosingTime(String s) {
        int pen = 0;
        int n = s.length();

        // Initial penalty: all 'Y' customers if shop closes at time 0
        for (int i = 0; i < n; i++) {
            if (s.charAt(i) == 'Y') pen++;
        }

        // Edge cases
        if (pen == n) return n; // all customers come
        if (pen == 0) return 0; // no customers come

        int best = 0;
        int best_count = pen;

        for (int i = 0; i < n; i++) {
            // Update penalty when moving closing time
            if (s.charAt(i) == 'N') pen++; // staying open costs
            else pen--;                   // serving a customer reduces cost

            // Track minimum penalty
            if (pen < best_count) {
                best_count = pen;
                best = i + 1;
            }
        }
        return best;
    }
}

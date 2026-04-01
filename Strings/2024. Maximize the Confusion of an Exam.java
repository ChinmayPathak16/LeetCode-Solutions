class Solution {
    public int maxConsecutiveAnswers(String answerKey, int k) {
        return Math.max(helper(answerKey, k, 'T'), helper(answerKey, k, 'F'));
    }

    private int helper(String s, int k, char ch) {
        int left = 0, maxLen = 0, count = 0;

        for (int right = 0; right < s.length(); right++) {
            if (s.charAt(right) != ch) count++;

            while (count > k) {
                if (s.charAt(left) != ch) count--;
                left++;
            }

            maxLen = Math.max(maxLen, right - left + 1);
        }

        return maxLen;
    }
}

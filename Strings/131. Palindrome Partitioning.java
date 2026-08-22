class Solution {

    private boolean checkPali(String s, int left, int right) {
        while (left < right) {
            if (s.charAt(left) != s.charAt(right))
                return false;

            left++;
            right--;
        }

        return true;
    }

    private void solve(
        String s,
        int start,
        List<String> current,
        List<List<String>> result
    ) {

        // Entire string has been partitioned
        if (start == s.length()) {
            result.add(new ArrayList<>(current));
            return;
        }

        for (int end = start; end < s.length(); end++) {

            if (checkPali(s, start, end)) {

                // Choose
                current.add(s.substring(start, end + 1));

                // Explore
                solve(s, end + 1, current, result);

                // Undo choice
                current.remove(current.size() - 1);
            }
        }
    }

    public List<List<String>> partition(String s) {

        List<List<String>> result = new ArrayList<>();

        solve(s, 0, new ArrayList<>(), result);

        return result;
    }
}

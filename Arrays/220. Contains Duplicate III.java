import java.util.TreeSet;

class Solution {
    public boolean containsNearbyAlmostDuplicate(int[] nums, int indexDiff, int valueDiff) {
        // Invalid constraints
        if (indexDiff <= 0 || valueDiff < 0) return false;

        // TreeSet keeps elements sorted
        TreeSet<Long> set = new TreeSet<>();

        for (int i = 0; i < nums.length; i++) {
            long x = nums[i]; // current element

            // Check nearest smaller or equal value
            Long floor = set.floor(x);
            if (floor != null && x - floor <= valueDiff) return true;

            // Check nearest greater or equal value
            Long ceil = set.ceiling(x);
            if (ceil != null && ceil - x <= valueDiff) return true;

            // Add current element to window
            set.add(x);

            // Maintain sliding window of size indexDiff
            if (i >= indexDiff) {
                set.remove((long) nums[i - indexDiff]);
            }
        }
        return false; // no valid pair found
    }
}

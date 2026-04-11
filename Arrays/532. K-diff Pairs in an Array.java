import java.util.*;

class Solution {
    public int findPairs(int[] nums, int k) {
        if (k < 0) return 0;

        Map<Integer, Integer> map = new HashMap<>();
        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        int count = 0;

        if (k == 0) {
            for (int val : map.values()) {
                if (val > 1) count++;
            }
        } else {
            for (int num : map.keySet()) {
                if (map.containsKey(num + k)) count++;
            }
        }

        return count;
    }
}

import java.util.*;

class Solution {
    public List<Integer> solveQueries(int[] nums, int[] queries) {
        int n = nums.length;

        // Step 1: Store indices of each element
        Map<Integer, List<Integer>> map = new HashMap<>();
        for (int i = 0; i < n; i++) {
            map.putIfAbsent(nums[i], new ArrayList<>());
            map.get(nums[i]).add(i);
        }

        List<Integer> ans = new ArrayList<>();

        // Step 2: Process queries
        for (int q : queries) {
            int ele = nums[q];
            List<Integer> list = map.get(ele);

            if (list.size() < 2) {
                ans.add(-1);
                continue;
            }

            // Binary search to find position of q in list
            int idx = Collections.binarySearch(list, q);

            int dist = Integer.MAX_VALUE;

            // Check previous occurrence
            if (idx > 0) {
                int prev = list.get(idx - 1);
                dist = Math.min(dist, Math.min((q - prev + n) % n, (prev - q + n) % n));
            } else {
                int prev = list.get(list.size() - 1);
                dist = Math.min(dist, Math.min((q - prev + n) % n, (prev - q + n) % n));
            }

            // Check next occurrence
            if (idx < list.size() - 1) {
                int next = list.get(idx + 1);
                dist = Math.min(dist, Math.min((q - next + n) % n, (next - q + n) % n));
            } else {
                int next = list.get(0);
                dist = Math.min(dist, Math.min((q - next + n) % n, (next - q + n) % n));
            }

            ans.add(dist);
        }

        return ans;
    }
}

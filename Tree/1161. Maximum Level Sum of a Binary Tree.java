/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;                // Value of the node
 *     TreeNode left;          // Left child
 *     TreeNode right;         // Right child
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {

    // Returns the level (1-indexed) with the maximum sum of node values
    public int maxLevelSum(TreeNode root) {

        // Edge case: empty tree
        if (root == null) return 0;

        // Queue for level-order (BFS) traversal
        Queue<TreeNode> q = new LinkedList<>();
        q.offer(root);

        int level = 1;                 // Current level
        int ans = level;               // Level with maximum sum
        int maxSum = Integer.MIN_VALUE; // Maximum level sum found so far

        // BFS traversal
        while (!q.isEmpty()) {

            int size = q.size(); // Number of nodes at current level
            int sum = 0;         // Sum of values at current level

            // Process all nodes of the current level
            for (int i = 0; i < size; i++) {
                TreeNode cur = q.poll();
                sum += cur.val;

                // Add children to queue for next level
                if (cur.left != null) q.offer(cur.left);
                if (cur.right != null) q.offer(cur.right);
            }

            // Update maximum sum and corresponding level
            if (sum > maxSum) {
                maxSum = sum;
                ans = level;
            }

            level++; // Move to next level
        }

        // Return the level having the maximum sum
        return ans;
    }
}

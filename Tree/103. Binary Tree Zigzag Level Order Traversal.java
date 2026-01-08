/**
 * Zigzag (Spiral) Level Order Traversal of a Binary Tree
 *
 * Approach:
 * - Use Breadth First Search (BFS) with a queue
 * - Traverse the tree level by level
 * - Reverse the list of values at every alternate level
 *
 * Time Complexity: O(n)
 * Space Complexity: O(n)
 */
class Solution {

    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {

        // Final result list
        List<List<Integer>> ans = new ArrayList<>();

        // Edge case: empty tree
        if (root == null) {
            return ans;
        }

        // Queue for BFS traversal
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);

        // Level counter (1-based indexing)
        int level = 1;

        // BFS traversal
        while (!q.isEmpty()) {

            // Number of nodes at current level
            int size = q.size();

            // List to store current level values
            List<Integer> list = new ArrayList<>();

            // Process all nodes of the current level
            for (int i = 0; i < size; i++) {
                TreeNode cur = q.poll();

                // Add current node value
                list.add(cur.val);

                // Add left and right children to queue
                if (cur.left != null)
                    q.add(cur.left);
                if (cur.right != null)
                    q.add(cur.right);
            }

            // Reverse values on even levels to achieve zigzag order
            if (level % 2 == 0) {
                Collections.reverse(list);
            }

            // Add current level list to final answer
            ans.add(list);

            // Move to next level
            level++;
        }

        return ans;
    }
}

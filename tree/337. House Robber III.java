/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
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
    public int rob(TreeNode root) {
        int[] tree = traverse(root);
        return Math.max(tree[0] , tree[1]);
    }

    private int[] traverse(TreeNode root){
        if(root == null){
            return new int[2];
        }
        int[] leftChoice = traverse(root.left);
        int[] rightChoice = traverse(root.right);
        int[] choice = new int[2];

        choice[0] = root.val + leftChoice[1] + rightChoice[1];
        choice[1] = Math.max(leftChoice[0] , leftChoice[1]) + Math.max(rightChoice[1] , rightChoice[0]);

        return choice;
    }

}

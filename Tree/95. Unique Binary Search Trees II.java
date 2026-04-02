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
    public List<TreeNode> generateTrees(int n) {
        if(n == 0)  return new ArrayList<>();
        return solve(1,n);
    }
    private List<TreeNode> solve(int s, int e){
        List<TreeNode> res = new ArrayList<>();
        if(s>e){
            res.add(null);
            return res;
        }
        for(int i=s; i<=e; i++){
            List<TreeNode> left = solve(s,i-1);
            List<TreeNode> right = solve(i+1,e);

            for(TreeNode l: left){
                for(TreeNode r: right){
                    TreeNode root = new TreeNode(i);
                    root.left = l;
                    root.right = r;
                    res.add(root);
                }
            }
        }
        return res;
    }
}

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
    public TreeNode balanceBST(TreeNode root) {
        ArrayList<Integer> list = new ArrayList<>();
        toList(root,list);
        return buildTree(list , 0, list.size() - 1);
    }
    private void toList(TreeNode root,ArrayList<Integer> list){
        if(root == null){
            return;
        }
        toList(root.left , list);
        list.add(root.val);
        toList(root.right , list);
    }
    private TreeNode buildTree(ArrayList<Integer> list,int left,int right){
        if(left > right)    return null;
        int mid = (left+right)/2;
        TreeNode root = new TreeNode(list.get(mid));
        root.left = buildTree(list, left, mid-1);
        root.right = buildTree(list, mid+1, right);
        return root;
    }
}

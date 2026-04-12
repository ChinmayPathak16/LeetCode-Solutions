class Solution {
    int preIndex = 0;
    HashMap<Integer, Integer> map = new HashMap<>();

    public TreeNode buildTree(int[] preorder, int[] inorder) {
        // Store inorder indices for O(1) lookup
        for (int i = 0; i < inorder.length; i++) {
            map.put(inorder[i], i);
        }
        return build(preorder, 0, inorder.length - 1);
    }

    private TreeNode build(int[] preorder, int left, int right) {
        if (left > right) return null;

        int rootVal = preorder[preIndex++];
        TreeNode root = new TreeNode(rootVal);

        int inIndex = map.get(rootVal);

        root.left = build(preorder, left, inIndex - 1);
        root.right = build(preorder, inIndex + 1, right);

        return root;
    }
}

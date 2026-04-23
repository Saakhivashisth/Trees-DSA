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
    int maxDia = 0;

    public int diameterOfBinaryTree(TreeNode root) {

        longest(root);
        return maxDia;
    }

    private int longest(TreeNode node) {

        if (node == null)
            return 0;

        int lh = longest(node.left);
        int rh = longest(node.right);
        maxDia = Math.max(maxDia, lh + rh);
        return Math.max(lh, rh) + 1;

    }
}

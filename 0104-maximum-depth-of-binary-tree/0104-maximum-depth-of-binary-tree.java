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
    public int maxDepth(TreeNode root) {
        return dfs(root);
    }
    private int dfs(TreeNode node){
        if(node==null) return 0;

        int lh=dfs(node.left);
        int rh=dfs(node.right);

        if(lh==0) return rh+1;
        if(rh==0) return lh+1;

        return Math.max(lh,rh)+1;
    }
}
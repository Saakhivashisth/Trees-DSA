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
    public int minDepth(TreeNode root) {
      return findDepth(root);
    }
    public int findDepth(TreeNode node){
        if(node==null) return 0;
        int left=findDepth(node.left);
        int right=findDepth(node.right);

        //edge cases bcz we basically have to written distance till leaf

        if(right==0) return left+1;
        if(left==0) return right+1;
        int height=Math.min(left,right);
        return height+1;
    }
}
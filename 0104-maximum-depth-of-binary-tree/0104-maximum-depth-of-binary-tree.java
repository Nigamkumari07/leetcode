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
        if(root==null) return 0;
        //max left height nikalo root ke left substree se
        int l = maxDepth(root.left);
        //root ke right substree se max height nikalo
        int r = maxDepth(root.right);
//root ke left & rght substree ko compare kr max height nikalo
        return 1+ Math.max(l,r);
    }
}
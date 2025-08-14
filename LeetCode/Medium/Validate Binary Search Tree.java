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
    public boolean isValidBST(TreeNode root) {
        return isValid(root,Long.MIN_VALUE,Long.MAX_VALUE);
    }

    public boolean isValid(TreeNode node,long minV,long maxV){
        if(node==null) return true;

        if(node.val>= maxV||node.val<= minV) return false;

        return isValid(node.left,minV,node.val) && isValid(node.right,node.val,maxV);
    }
}

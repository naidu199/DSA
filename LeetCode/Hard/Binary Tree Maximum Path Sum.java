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
    private int sum;
    public int maxPathSum(TreeNode root) {
        sum=root.val;
        dfs(root);
        return sum;
    }
    public int dfs(TreeNode node){
        if(node==null) return 0;
        int ls=Math.max(0,dfs(node.left));
        int rs=Math.max(0,dfs(node.right));
        sum=Math.max(ls+rs+node.val,sum);

        return node.val+Math.max(ls,rs);
    }
}

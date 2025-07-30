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
    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> list=new ArrayList<>();
        rightside(root,list,0);
        return list;
    }
    public void rightside(TreeNode node,List<Integer> list,int level){
        if(node==null) return;
        if(level==list.size()) list.add(node.val);
        rightside(node.right,list,level+1);
        rightside(node.left,list,level+1);
        
    }
}

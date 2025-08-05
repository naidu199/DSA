/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        ArrayList<TreeNode> l1=new ArrayList<>();
        ArrayList<TreeNode> l2=new ArrayList<>();

        findPath(root,p,l1);
        findPath(root,q,l2);

        TreeNode ans=null;
        int n = Math.min(l1.size(), l2.size());
        int i = 0;

        while (i < n && l1.get(i) == l2.get(i)) {
            ans = l1.get(i);
            i++;
        }
        return ans;
        
    }

    public boolean findPath(TreeNode node,TreeNode target,ArrayList<TreeNode> list ){
        if(node==null) return false;

        list.add(node);
        if(node==target) return true;

        if(findPath(node.left,target,list)||findPath(node.right,target,list)){
            return true;
        }
        list.remove(list.size()-1);
        return false;


    }
}

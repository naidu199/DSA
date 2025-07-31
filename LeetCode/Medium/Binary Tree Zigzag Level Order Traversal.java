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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> ans=new ArrayList<>();
        Queue<TreeNode> q=new LinkedList<>();
        if(root==null) return ans;
        boolean flag=false;
        q.offer(root);

        while(!q.isEmpty()){
            int n=q.size();
            List<Integer> sub=new ArrayList<>();
            for(int i=0;i<n;i++){
                TreeNode node=q.poll();
                
                sub.add(node.val);
                if (node.left != null) q.offer(node.left);
                if (node.right != null) q.offer(node.right);
            }
            
            if (flag) {
                Collections.reverse(sub);
            }  
            flag=!flag;          
            ans.add(sub);
        }
        return ans;
    }
}

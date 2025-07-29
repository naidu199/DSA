//iterative approach
class Solution {
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> list=new ArrayList<>();
        Stack<TreeNode> stack=new Stack<>();
        TreeNode node=root;

        while(true){
           if(node!=null) {
            stack.push(node);
            node=node.left;
           }else{
            if(stack.isEmpty()) break;
            node = stack.pop();
            list.add(node.val);
            node=node.right;
           }
        }

        return list;
    }
}
// recursion
class Solution {
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        inorder(root,list);
        return list;
    }
    public void inorder(TreeNode node,List<Integer> list){
        if(node==null) return ;
        inorder(node.left,list);
        list.add(node.val);
        inorder(node.right,list);
    }
}
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

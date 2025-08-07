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
class BSTIterator {

    private Stack<TreeNode> stack= new Stack<>();

    public BSTIterator(TreeNode root) {
        pushIntoStack(root);
    }
    
    public int next() {
        TreeNode t=stack.pop();
        pushIntoStack(t.right);
        return t.val;
    }
    
    public boolean hasNext() {
        return !stack.isEmpty();
    }

    public void pushIntoStack(TreeNode node){
        
        while(node!=null){
            stack.push(node);
            node=node.left;
        }
    }
}

/**
 * Your BSTIterator object will be instantiated and called as such:
 * BSTIterator obj = new BSTIterator(root);
 * int param_1 = obj.next();
 * boolean param_2 = obj.hasNext();
 */

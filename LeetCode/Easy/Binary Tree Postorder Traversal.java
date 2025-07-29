//recursive 
class Solution {
    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> list=new ArrayList<>();
        postOrder(root,list);
        return list;
    }
    public void postOrder(TreeNode node,List<Integer> list){
        if(node==null) return;
        postOrder(node.left,list);
        postOrder(node.right,list);
        list.add(node.val);

    }
}
//iterative using 2 stacks
class Solution {
    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        Stack<TreeNode> s1=new Stack<>();
        Stack<TreeNode> s2=new Stack<>();
        if(root == null) return list;
        s1.push(root);
        while(!s1.isEmpty()){
            TreeNode node= s1.pop();
            s2.push(node);
            if(node.left!=null){
                s1.push(node.left);
            }
            if(node.right!=null){
                s1.push(node.right);
            }
            
        }
        while(!s2.isEmpty()){
            list.add(s2.pop().val);
        }
        return list;
    }
}

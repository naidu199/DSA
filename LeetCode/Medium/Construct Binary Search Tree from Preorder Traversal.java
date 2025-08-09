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

O(N*N) 
class Solution {
    public TreeNode bstFromPreorder(int[] preorder) {
        TreeNode root=new TreeNode(preorder[0]);

        for(int i=1;i<preorder.length;i++){
            int val=preorder[i];
            TreeNode node=root;

            while(true){
                if(node.val>val){
                    if(node.left!=null){
                        node=node.left;
                    }else{
                        node.left=new TreeNode(val);
                        break;
                    }
                }else{
                   if(node.right!=null){
                        node=node.right;
                    }else{
                        node.right=new TreeNode(val);
                        break;
                    } 
                }
            }
        }

        return root;
    }
}
